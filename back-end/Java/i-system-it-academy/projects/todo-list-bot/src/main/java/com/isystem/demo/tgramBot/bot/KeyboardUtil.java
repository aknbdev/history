package com.isystem.demo.tgramBot.bot;
import com.vdurmont.emoji.EmojiParser;
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

    public ReplyKeyboardMarkup mainMenu() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        KeyboardButton createButton = new KeyboardButton(EmojiParser.parseToUnicode(":heavy_plus_sign:") + " Create");
        KeyboardButton ToDoListsButton = new KeyboardButton(EmojiParser.parseToUnicode(":clipboard:") + " ToDoLists");

        KeyboardRow row = new KeyboardRow();
        row.add(createButton);
        row.add(ToDoListsButton);

        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }

    public ReplyKeyboard todo(Long id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton show = new InlineKeyboardButton("Show");

        InlineKeyboardButton delete = new InlineKeyboardButton("Delete");

        show.setCallbackData(String.format("/show/%s", id));

        delete.setCallbackData(String.format("/del/%s", id));

        List<InlineKeyboardButton> row = new ArrayList<>();

        row.add(show);
        row.add(delete);

        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        rows.add(row);

        inlineKeyboardMarkup.setKeyboard(rows);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup cancelButton(Long id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton back = new InlineKeyboardButton("Back");
        back.setCallbackData(String.format("/back/%s", id));

        List<InlineKeyboardButton> row = new ArrayList<>();

        row.add(back);

        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        rows.add(row);

        inlineKeyboardMarkup.setKeyboard(rows);
        return inlineKeyboardMarkup;
    }

    public ReplyKeyboard saveCancel() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton save = new InlineKeyboardButton("Save");
        InlineKeyboardButton cancel = new InlineKeyboardButton("Cancel");
        save.setCallbackData("/finished/save");
        cancel.setCallbackData("/finished/cancel");

        List<InlineKeyboardButton> row = new ArrayList<>();
        row.add(save);
        row.add(cancel);

        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        rows.add(row);

        inlineKeyboardMarkup.setKeyboard(rows);
        return inlineKeyboardMarkup;
    }
}

















// |- todo save and cancel command -|
//    public ReplyKeyboard createdMenu() {
//
//    }
