package uz.isystem.bookBooking.bot.dto;

import lombok.Data;
import org.springframework.stereotype.Component;
import uz.isystem.bookBooking.bot.enums.MenuState;

import java.util.HashMap;
import java.util.Map;

@Component @Data
public class Menu {
    private Map<Long, MenuState> menuStateMap = new HashMap<>();
}
