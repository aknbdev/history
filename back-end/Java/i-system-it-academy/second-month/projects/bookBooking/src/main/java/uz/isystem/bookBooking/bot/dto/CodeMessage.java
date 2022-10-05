package uz.isystem.bookBooking.bot.dto;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import uz.isystem.bookBooking.bot.enums.CodeMessageType;

@Component @Data
public class CodeMessage {
    private SendMessage sendMessage;
    private EditMessageText editMessageText;
    private CodeMessageType codeMessageType;
}
