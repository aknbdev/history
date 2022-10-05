package com.isystem.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String[] args) throws Exception{
		String sql = "INSERT INTO persons (fullname, email, password) VALUES (?, ?, ?)";
		int result = jdbcTemplate.update(sql, "Axrorbek", "Abduxamidov@gmail.com", "2005");
		if (result>0){
			System.out.println("A new table created!");
		}
	}

}