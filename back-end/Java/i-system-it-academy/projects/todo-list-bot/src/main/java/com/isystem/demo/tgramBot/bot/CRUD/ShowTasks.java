package com.isystem.demo.tgramBot.bot.CRUD;
import com.isystem.demo.models.Task;
import com.isystem.demo.tgramBot.bot.BotTaskService;
import com.isystem.demo.tgramBot.bot.KeyboardUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class ShowTasks {
    @Autowired
    private BotTaskService botTaskService;
    @Autowired
    private KeyboardUtil keyboardUtil;


    public EditMessageText showTask(String data, Message message) {
        EditMessageText editMessageText = new EditMessageText();

        String[] arr = data.split("/");
        Long index = Long.valueOf(arr[2]);
        Task task = botTaskService.findByTask_id(index);

        editMessageText.setMessageId(message.getMessageId());
        editMessageText.setChatId(String.valueOf(message.getChatId()));
        editMessageText.setText(
                "\n*Title: *" + task.getTitle() +
                        "\n*Content: *" + task.getContent()+
                        "\n*Deadline: *" + task.getDeadline());
        editMessageText.enableMarkdown(true);
        editMessageText.setReplyMarkup(keyboardUtil.cancelButton(task.getTask_id()));


        return editMessageText;
    }
}
