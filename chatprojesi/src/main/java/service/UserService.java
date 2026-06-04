package service;
import model.User;
import repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {this.userRepository = userRepository;
    }
    public User kullaniciKaydet(User user) {return userRepository.save(user);
    }
    public List<User> kullanicilariListele() {
        return userRepository.findAll();
    }
    public User kullaniciGuncelle(Long id, User yeniUser) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı"));
        if (user != null)
            user.setKullaniciAdi(yeniUser.getKullaniciAdi());
            user.setSifre(yeniUser.getSifre());
            user.setEposta(yeniUser.getEposta());
            return userRepository.save(user);
        }
        public void kullaniciSil (Long id){
            userRepository.deleteById(id);}}