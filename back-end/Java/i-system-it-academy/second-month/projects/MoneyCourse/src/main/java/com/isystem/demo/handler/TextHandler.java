package com.isystem.demo.handler;
import com.isystem.demo.util.KeyboardUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class TextHandler {
    @Autowired
    private KeyboardUtil keyboardUtil;
    SendMessage sendMessage = new SendMessage();
    public SendMessage startCommand(Message message) {
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText("Welcome to Abdulaziz's bot");
        sendMessage.setReplyMarkup(keyboardUtil.mainMenu());
        return sendMessage;
    }

    public SendMessage aboutCommand(Message message) {
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText("Hi This bot is Abdulaziz's first bot wrote with Java");
        sendMessage.setReplyMarkup(keyboardUtil.helpMenu());
        return sendMessage;
    }

    public SendMessage defaultAnswer(Message message) {
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText("Unknown request!");
        return sendMessage;
    }
}
