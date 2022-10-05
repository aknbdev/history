package uz.isystem.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.isystem.security.controller.vm.LoginVM;
import uz.isystem.security.model.User;
import uz.isystem.security.repository.UserRepository;
import uz.isystem.security.security.JwtTokenProvider;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserJwtController {
    @Autowired private AuthenticationManager authenticationManager;
    @Autowired private JwtTokenProvider jwtTokenProvider;
    @Autowired private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginVM loginVM){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginVM.getUserName(), loginVM.getPassword()));
        Optional<User> user = userRepository.findByUserName(loginVM.getUserName());
        if (user.isEmpty()){
            throw new UsernameNotFoundException("Bu user mavjud emas!");
        }
        String token = jwtTokenProvider.createToken(user.get().getUserName(), user.get().getRoles());
        Map<Object, Object> map = new HashMap<>();
        map.put("userName", user.get().getUserName());
        map.put("token", token);
        return ResponseEntity.ok(map);
    }

}
