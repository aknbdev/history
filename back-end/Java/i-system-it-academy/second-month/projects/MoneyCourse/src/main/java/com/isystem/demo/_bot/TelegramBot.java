package com.isystem.demo._bot;

import com.isystem.demo.handler.TextHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class TelegramBot extends TelegramLongPollingBot {
    @Autowired
    private TextHandler textHandler;

    @Override
    public String getBotUsername() {
        return "I_Techpractisebot";
    }

    @Override
    public String getBotToken() {
        return "1774271133:AAF9Fj7PnjQLvJRJzYalYi8gzga0bH2zM8A";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()){
            Message message = update.getMessage();
            if (message.hasText()){
                SendMessage sendMessage = new SendMessage();
                String text = message.getText();
                if (text.equals("/start")){
                    sendMessage = textHandler.startCommand(message);
                    executeMessage(sendMessage);
                }
                else if (text.equals("/about")){
                    sendMessage = textHandler.aboutCommand(message);
                    executeMessage(sendMessage);
                } else if (text.equals("Service")){

                } else {
                    sendMessage = textHandler.defaultAnswer(message);
                    executeMessage(sendMessage);
                }
            }
        }else if (update.hasCallbackQuery()){
            CallbackQuery callback = update.getCallbackQuery();
            String data = callback.getData();
            System.out.println(data);
            Message message = callback.getMessage();
            String text = message.getText();
            System.out.println(text);
        }
    }

    public void executeMessage(SendMessage sendMessage){
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
