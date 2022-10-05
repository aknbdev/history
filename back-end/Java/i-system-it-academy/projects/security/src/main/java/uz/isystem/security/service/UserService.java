package uz.isystem.security.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.isystem.security.model.User;
import uz.isystem.security.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired private UserRepository userRepository;
    @Autowired private PasswordEncoder passwordEncoder;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User create(User requestUser) {
        requestUser.setPassword(passwordEncoder.encode(requestUser.getPassword()));
        return userRepository.save(requestUser);
    }



    // |- Secondary functions -|
    public Optional<User> checkUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
