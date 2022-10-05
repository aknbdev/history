package com.isystem.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	// |- Fixed Rate scheduling -|
//	@Scheduled(fixedRate = (1000L))
//	public void ScheduleRate(){
//		System.out.println("FixedRate . " + new Date());
//	}
//
//	// |- Fixed Delay scheduling -|
//	@Scheduled(fixedDelay = (1000L))
//	public void ScheduleDelay(){
//		System.out.println("FixedDelay . " + new Date());
//	}
//
//	// |- Crone Scheduling cron = "second, minute, hour, month, year, weekday" -|
//	@Scheduled(cron = "0 31 00 * * *")
//	public void ScheduleCron(){
//		System.out.println("ScheduleCron" + new Date());
//	}
}