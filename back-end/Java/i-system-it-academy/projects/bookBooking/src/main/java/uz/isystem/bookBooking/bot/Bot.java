package uz.isystem.bookBooking.bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.isystem.bookBooking.bot.dto.CodeMessage;

@Component
public class Bot extends TelegramLongPollingBot {
    @Autowired private UpdateHandler updateHandler;
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
        executeMessage(updateHandler.handle(update));
    }

    private void executeMessage(CodeMessage codeMessage) {
        try {
            switch (codeMessage.getCodeMessageType()){
                case MESSAGE -> execute(codeMessage.getSendMessage());
                case EDIT -> execute(codeMessage.getEditMessageText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
