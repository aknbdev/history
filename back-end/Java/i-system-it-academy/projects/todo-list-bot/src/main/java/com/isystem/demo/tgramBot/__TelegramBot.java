package com.isystem.demo.tgramBot;
import com.isystem.demo.dto.CodeMessage;
import com.isystem.demo.tgramBot.bot.CRUD.TasksList;
import com.isystem.demo.tgramBot.bot._UpdateHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class __TelegramBot extends TelegramLongPollingBot {
    @Autowired private TasksList tasksList;
    @Autowired private _UpdateHandler updateHandler;
    @Override public String getBotUsername() { return "A_K_ToDoList_bot"; }
    @Override public String getBotToken() { return "5205762924:AAHypbXq3iClOlUDkMtRa9jtrdVFNR1i41A"; }
    @Override public void onUpdateReceived(Update update) {
        executeCodes(updateHandler.updateHandle(update));
    }

    private void executeCodes(CodeMessage codeMessage) {
        try {
            switch (codeMessage.getCodeMessageType()) {
                case MESSAGE -> execute(codeMessage.getSendMessage());
                case EDIT -> execute(codeMessage.getEditMessageText());
                case LIST -> {
                    for (int i = 0; i<codeMessage.getTaskList().size(); i++) {
                        execute(tasksList.sendAll(i, codeMessage.getTaskList()));
                    }
                }
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}