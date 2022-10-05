package com.isystem.demo;

import com.isystem.demo._bot.TelegramBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private final TelegramBot telegramBot;

	public DemoApplication(TelegramBot telegramBot) {
		this.telegramBot = telegramBot;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
