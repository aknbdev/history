package uz.isystem.bookBooking.bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.isystem.bookBooking.bot.dto.CodeMessage;
import uz.isystem.bookBooking.bot.dto.Menu;
import uz.isystem.bookBooking.bot.enums.MenuState;
import uz.isystem.bookBooking.bot.menu.MainMenu;

@Component
public class UpdateHandler {
    @Autowired private MainMenu mainMenu;
    @Autowired private Menu menu;
    public CodeMessage handle(Update update) {
        CodeMessage codeMessage = new CodeMessage();
        MenuState menuState = menu.getMenuStateMap().get(update.getMessage().getChatId());
        if (update.hasMessage() && menuState!=null){
            Message message = new Message();
            if (message.hasText()){
                String text = message.getText();
                switch (text){
                    case "/start" -> {
                        codeMessage = mainMenu.startMenu(message);

                    }
                    case "Asosiy oyna" -> {
                        codeMessage = mainMenu.asosiyMenu(message);
                    }
                    default -> {
                        codeMessage = mainMenu.defaultCommand(message);
                    }
                }
            }
        }
        return codeMessage;
    }
}
