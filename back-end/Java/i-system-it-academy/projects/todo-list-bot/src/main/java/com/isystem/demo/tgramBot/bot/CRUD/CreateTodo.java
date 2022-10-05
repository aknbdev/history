package com.isystem.demo.tgramBot.bot.CRUD;
import com.isystem.demo.dto.CodeMessage;
import com.isystem.demo.enums.CodeMessageType;
import com.isystem.demo.enums.TodoItemType;
import com.isystem.demo.models.Task;
import com.isystem.demo.tgramBot.bot.BotTaskService;
import com.isystem.demo.tgramBot.bot.KeyboardUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class CreateTodo {
    @Autowired
    private KeyboardUtil keyboardUtil;
    @Autowired
    private BotTaskService botService ;
    private final Map<Long, Task> toDoItemMap = new HashMap<>();


    public CodeMessage createItem(Message message, String data) {
        CodeMessage codeMessage = new CodeMessage();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(message.getChatId()));

         if (data.startsWith("/finished/")){
             Task toDoItem = this.toDoItemMap.get(message.getChatId());
             EditMessageText editMessageText = new EditMessageText();
             editMessageText.setMessageId(message.getMessageId());
             editMessageText.setChatId(String.valueOf(message.getChatId()));
             editMessageText.enableMarkdown(true);
             if (data.endsWith("/save")){
                 botService.saveTask(toDoItem);
                 editMessageText.setText(
                         "\n*Title: *" + toDoItem.getTitle() +
                                 "\n*Content: *" + toDoItem.getContent()+
                                 "\n*Deadline: *" + toDoItem.getDeadline() +
                                 "\n*Status: * Saved.");
                 toDoItemMap.remove(toDoItem.getId());
             } else if (data.endsWith("/cancel")){
                 editMessageText.setText("Ok, Task Cancelled.");
                 toDoItemMap.remove(toDoItem.getId());
             }
             codeMessage.setEditMessageText(editMessageText);
             codeMessage.setCodeMessageType(CodeMessageType.EDIT);
        } else if (data.equals("➕ Create")){
            sendMessage.setChatId(String.valueOf(message.getChatId()));
            sendMessage.setText("Enter ToDo *Title*\nEx: Todo List!");
            sendMessage.enableMarkdown(true);

            Task toDoItem = new Task();
            toDoItem.setTask_id(Long.valueOf(message.getMessageId()));
            toDoItem.setUser_id(message.getChatId());
            toDoItem.setTodoItemType(TodoItemType.TITLE);
            toDoItemMap.put(message.getChatId(), toDoItem);

            codeMessage.setSendMessage(sendMessage);
            codeMessage.setCodeMessageType(CodeMessageType.MESSAGE);
        }else if (this.getToDoItemMap().containsKey(message.getChatId())){
            Task toDoItem = this.toDoItemMap.get(message.getChatId());
            if (toDoItem.getTodoItemType().equals(TodoItemType.TITLE)){
                toDoItem.setTitle(data);
                toDoItem.setTodoItemType(TodoItemType.CONTENT);
                sendMessage.setText(
                        " <b>Title: </b> " + toDoItem.getTitle() +
                        "\n" + "Now Enter <b>Content</b>\nEx: I should do Todo List!");
                sendMessage.enableHtml(true);
            } else if (toDoItem.getTodoItemType().equals(TodoItemType.CONTENT)){
                toDoItem.setContent(data);
                toDoItem.setTodoItemType(TodoItemType.DEADLINE);
                sendMessage.setText(
                        "*Title: *" + toDoItem.getTitle() +
                                "\n*Content: *" + toDoItem.getContent()+
                                "\nNow Enter *Deadline:*\nEx:18-07-2003T12:34");
                sendMessage.enableMarkdown(true);
            } else if (toDoItem.getTodoItemType().equals(TodoItemType.DEADLINE)){
                toDoItem.setDeadline(LocalDateTime.parse(data));
                sendMessage.enableMarkdown(true);
                toDoItem.setCreated_date(new Date());
                toDoItem.setStatus(true);
                toDoItem.setTodoItemType(TodoItemType.FINISHED);
                sendMessage.setText("Do you want to save Task!");
                sendMessage.setReplyMarkup(keyboardUtil.saveCancel());
            }
            codeMessage.setSendMessage(sendMessage);
            codeMessage.setCodeMessageType(CodeMessageType.MESSAGE);
        }
        return codeMessage;
    }

    public Map<Long, Task> getToDoItemMap() {
        return toDoItemMap;
    }
}
