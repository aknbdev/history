package com.isystem.demo.tgramBot.bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class TextHandler {
    @Autowired
    KeyboardUtil keyboardUtil;

    SendMessage sendMessage = new SendMessage();
    public SendMessage startCommand(Message message) {
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText("#Bismillah\nYou can create To Do Lists with my bot.");
        sendMessage.setReplyMarkup(keyboardUtil.mainMenu());
        return sendMessage;
    }

    public SendMessage defaultCommand(Message message) {
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText("Unknown request.\nPlease check and try again!");
        return sendMessage;
    }

}









//    private KeyboardUtil keyboardUtil = new KeyboardUtil();
//    SendMessage sendMessage = new SendMessage();
//    public SendMessage startCommand(Message message) {
//
//    }
//
//    public SendMessage defaultCommand(Message message) {
//
//    }
//
//    public SendMessage saveCommand(Message message) {
//        sendMessage.setChatId(message.getChatId().toString());
//        sendMessage.setText("If you want to save.\nPlease, Press save button or cancel.");
//        sendMessage.setReplyMarkup(keyboardUtil.createdMenu());
//        return sendMessage;
//    }