package uz.isystem.bookBooking.bot.menu;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.isystem.bookBooking.bot.dto.CodeMessage;
import uz.isystem.bookBooking.bot.enums.CodeMessageType;
import uz.isystem.bookBooking.bot.util.ButtonUtil;

@Component
public class MainMenu {
    public CodeMessage startMenu(Message message) {
        CodeMessage codeMessage = new CodeMessage();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        sendMessage.setText("#bismillah\nAssalomu alaikum.\nAsosiy oyna tugmasini bosish orqali kitob zakaz qilishingiz mumkin.");
        sendMessage.setReplyMarkup(
                ButtonUtil.keyboardMarkup(
                        ButtonUtil.rows(
                                ButtonUtil.row(
                                        ButtonUtil.button("Asosiy oyna")
                                )
                        )
                )
        );
        codeMessage.setSendMessage(sendMessage);
        codeMessage.setCodeMessageType(CodeMessageType.MESSAGE);
        return codeMessage;
    }

    public CodeMessage asosiyMenu(Message message) {
        CodeMessage codeMessage = new CodeMessage();
        SendMessage sendMessage = new SendMessage();

        sendMessage.setChatId(String.valueOf(message.getChatId()));
        sendMessage.setText("#bismillah\nAssalomu alaikum.\nAsosiy oyna tugmasini bosish orqali kitob zakaz qilishingiz mumkin.");
        sendMessage.setReplyMarkup(
                ButtonUtil.keyboardMarkup(
                        ButtonUtil.rows(
                                ButtonUtil.row(
                                        ButtonUtil.button("Diniy"),
                                        ButtonUtil.button("Badiy")
                                ),
                                ButtonUtil.row(
                                        ButtonUtil.button("Biznes"),
                                        ButtonUtil.button("IT")
                                )
                        )
                )
        );
        codeMessage.setSendMessage(sendMessage);
        codeMessage.setCodeMessageType(CodeMessageType.MESSAGE);
        return codeMessage;
    }

    public CodeMessage defaultCommand(Message message) {
        CodeMessage codeMessage = new CodeMessage();
        SendMessage sendMessage = new SendMessage();

        sendMessage.setChatId(String.valueOf(message.getChatId()));
        sendMessage.setText("Kutilmagan buyruq.");
        codeMessage.setSendMessage(sendMessage);
        codeMessage.setCodeMessageType(CodeMessageType.MESSAGE);
        return codeMessage;
    }
}
