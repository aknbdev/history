package uz.isystem.security.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.security.model.User;
import uz.isystem.security.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> create(@RequestBody User requestUser){
        if (checkPassword(requestUser.getPassword())){
            return ResponseEntity.badRequest().body("Password length must be upper 5");
        }
        if (userService.checkUserName(requestUser.getUserName()).isPresent()){
            return ResponseEntity.badRequest().body("User Name already registered!");
        }
        return ResponseEntity.ok(userService.create(requestUser));
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(userService.getAll());
    }

    public boolean checkPassword(String password){
        return password.length() <= 5;
    }

}