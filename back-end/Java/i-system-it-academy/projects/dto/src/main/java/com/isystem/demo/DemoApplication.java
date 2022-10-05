package com.isystem.demo;
import com.isystem.demo.model.Location;
import com.isystem.demo.model.User;
import com.isystem.demo.repository.LocationRepository;
import com.isystem.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;
	@Autowired
	LocationRepository locationRepository;
	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Puma");
		location.setDescription("Puma is the place.");
		location.setLongitude(40.4);
		location.setLatitude(36.3);
		locationRepository.save(location);

		User user = new User();
		user.setFirstName("Axi");
		user.setLastName("bro");
		user.setEmail("axibro@gmail.com");
		user.setPassword("sir");
		user.setLocation(location);
		userRepository.save(user);

		User user1 = new User();
		user1.setFirstName("Axi1");
		user1.setLastName("bro1");
		user1.setEmail("axibro1@gmail.com");
		user1.setPassword("sir1");
		user1.setLocation(location);
		userRepository.save(user1);
	}
}
