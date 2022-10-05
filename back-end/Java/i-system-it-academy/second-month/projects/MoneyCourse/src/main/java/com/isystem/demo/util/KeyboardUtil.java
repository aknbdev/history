package com.isystem.demo.util;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

@Component
public class KeyboardUtil {
    public ReplyKeyboardMarkup mainMenu(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        KeyboardButton serviceButton = new KeyboardButton("Service");

        KeyboardButton settingsButton = new KeyboardButton();
        settingsButton.setText("Settings");

        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        row1.add(serviceButton);
        row2.add(settingsButton);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        keyboardRows.add(row1);
        keyboardRows.add(row2);

        replyKeyboardMarkup.setKeyboard(keyboardRows);
        return replyKeyboardMarkup;
    }

    public ReplyKeyboard helpMenu() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton about = new InlineKeyboardButton("About");
        about.setCallbackData("this is call back data");
        List<InlineKeyboardButton> row = new ArrayList<>();
        row.add(about);
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        rows.add(row);
        inlineKeyboardMarkup.setKeyboard(rows);
        return inlineKeyboardMarkup;
    }
}
