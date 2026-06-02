package service;

import model.User;
import repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User kullaniciKaydet(User user) {
        return userRepository.save(user);
    }

    public List<User> kullanicilariListele() {
        return userRepository.findAll();
    }
}