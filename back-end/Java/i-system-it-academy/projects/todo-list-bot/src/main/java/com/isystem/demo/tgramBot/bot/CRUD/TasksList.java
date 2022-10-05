package com.isystem.demo.tgramBot.bot.CRUD;
import com.isystem.demo.dto.CodeMessage;
import com.isystem.demo.enums.CodeMessageType;
import com.isystem.demo.models.Task;
import com.isystem.demo.tgramBot.bot.BotTaskService;
import com.isystem.demo.tgramBot.bot.KeyboardUtil;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

import java.util.List;

@Getter @Setter @Component
public class TasksList {
    @Autowired
    private BotTaskService botTaskService;
    @Autowired
    private KeyboardUtil keyboardUtil;

    public CodeMessage getAll(Message message) {
        CodeMessage codeMessage = new CodeMessage();
        codeMessage.setCodeMessageType(CodeMessageType.LIST);
        codeMessage.setTaskList(botTaskService.findAllByUser_id(message.getFrom().getId()));
        return codeMessage;
    }
    public SendMessage sendAll(int id, List<Task> taskList){
        SendMessage sendMessage = new SendMessage();
        Task task = taskList.get(id);
        sendMessage.setChatId(String.valueOf(task.getUser_id()));
        sendMessage.setText("`Title: " + task.getTitle()+"`");
        sendMessage.enableMarkdown(true);
        sendMessage.setReplyMarkup(keyboardUtil.todo(task.getTask_id()));
        return sendMessage;
    }

    public EditMessageText returnOne(String data, Message message) {
        EditMessageText editMessageText = new EditMessageText();
        String[] arr = data.split("/");
        Long index = Long.valueOf(arr[2]);
        Task task = botTaskService.findByTask_id(index);
        editMessageText.setMessageId(message.getMessageId());
        editMessageText.setChatId(String.valueOf(message.getChatId()));
        editMessageText.setText("\n*Title: *" + task.getTitle());
        editMessageText.enableMarkdown(true);
        editMessageText.setReplyMarkup((InlineKeyboardMarkup) keyboardUtil.todo(task.getTask_id()));
        return editMessageText;
    }
//
//    public SendMessage returnEmpty(List<Task> taskList) {
//        SendMessage sendMessage = new SendMessage();
//    }
}