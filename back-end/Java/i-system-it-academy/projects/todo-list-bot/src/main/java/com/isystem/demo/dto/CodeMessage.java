package com.isystem.demo.dto;
import com.isystem.demo.enums.CodeMessageType;
import com.isystem.demo.models.Task;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Component
public class CodeMessage {
    private SendMessage sendMessage;
    private EditMessageText editMessageText;
    private CodeMessageType codeMessageType;
    private List<Task> taskList;

}
