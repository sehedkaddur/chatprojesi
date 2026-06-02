package controller;
import model.User;
import org.springframework.web.bind.annotation.*;
import service.UserService;
@RestController
@RequestMapping("/kullanici")
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;}
    @PostMapping("/kaydet")
    public User kullaniciKaydet(@RequestBody User user) {
        return userService.kullaniciKaydet(user);
    }}
