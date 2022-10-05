package com.isystem.demo.tgramBot.bot;
import com.isystem.demo.dto.CodeMessage;
import com.isystem.demo.enums.CodeMessageType;
import com.isystem.demo.tgramBot.bot.CRUD.CreateTodo;
import com.isystem.demo.tgramBot.bot.CRUD.DeleteTask;
import com.isystem.demo.tgramBot.bot.CRUD.ShowTasks;
import com.isystem.demo.tgramBot.bot.CRUD.TasksList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class _UpdateHandler {
    @Autowired
    private TextHandler textHandler;
    @Autowired
    private CreateTodo createTodo;
    @Autowired
    private TasksList tasksList;
    @Autowired
    private ShowTasks showTasks;
    @Autowired private DeleteTask deleteTask;

    public CodeMessage updateHandle(Update update){
        CodeMessage codeMessage = new CodeMessage();
        SendMessage sendMessage ;

        if (update.hasMessage()){
            Message message = update.getMessage();
            if (message.hasText()){
                String text = message.getText();

                if (text.equals("➕ Create")){
                    codeMessage = createTodo.createItem(message, text);
                }
                else if (text.equals("\uD83D\uDCCB ToDoLists")){
                    codeMessage = tasksList.getAll(message);
                }else if (text.equals("/start")){
                    sendMessage = textHandler.startCommand(message);
                    codeMessage.setCodeMessageType(CodeMessageType.MESSAGE);
                    codeMessage.setSendMessage(sendMessage);
                } else if (this.createTodo.getToDoItemMap().containsKey(message.getChatId())){
                    codeMessage = createTodo.createItem(message, text);
                } else{
                    sendMessage = textHandler.defaultCommand(message);
                    codeMessage.setCodeMessageType(CodeMessageType.MESSAGE);
                    codeMessage.setSendMessage(sendMessage);
                }

            }

        } else if (update.hasCallbackQuery()){
            EditMessageText editMessageText = new EditMessageText();
            CallbackQuery callBack = update.getCallbackQuery();
            String data = callBack.getData();
            Message message = callBack.getMessage();
            if (data.startsWith("/show/")){
                editMessageText = showTasks.showTask(data, message);
                codeMessage.setCodeMessageType(CodeMessageType.EDIT);
                codeMessage.setEditMessageText(editMessageText);
            } else if (data.startsWith("/back/")){
                editMessageText = tasksList.returnOne(data, message);
                codeMessage.setCodeMessageType(CodeMessageType.EDIT);
                codeMessage.setEditMessageText(editMessageText);
            } else if (data.startsWith("/del/")){
                codeMessage = deleteTask.deleteTask(data, message);
            } else if (data.startsWith("/finished/")){
                codeMessage = createTodo.createItem(message, data);
            }
        }

        return codeMessage;
    }
}
