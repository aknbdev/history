package com.isystem.demo.tgramBot.bot.CRUD;
import com.isystem.demo.dto.CodeMessage;
import com.isystem.demo.enums.CodeMessageType;
import com.isystem.demo.tgramBot.bot.BotTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class DeleteTask {
    @Autowired private BotTaskService taskService;

    public CodeMessage deleteTask(String data, Message message) {
        CodeMessage codeMessage = new CodeMessage();
        EditMessageText editMessageText = new EditMessageText();
        editMessageText.setMessageId(message.getMessageId());
        editMessageText.setChatId(String.valueOf(message.getChatId()));
        String[] arr = data.split("/");
        long index = Long.parseLong(arr[2]);
        taskService.deleteTask(index);
        editMessageText.setText("Ok, Task deleted.");
        codeMessage.setCodeMessageType(CodeMessageType.EDIT);
        codeMessage.setEditMessageText(editMessageText);
        return codeMessage;
    }
}
