package service;
import model.User;
import repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class UserService {
    private static final Logger logger =
            LoggerFactory.getLogger(UserService.class);
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {this.userRepository = userRepository;
    }
    public User kullaniciKaydet(User user) {

        logger.info("Kullanıcı kaydedildi: " + user.getKullaniciAdi());

        return userRepository.save(user);
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
        logger.info("Kullanıcı güncellendi: " + user.getId());
            return userRepository.save(user);
        }
    public void kullaniciSil(Long id) {
        logger.info("Kullanıcı silindi: " + id);
        userRepository.deleteById(id);
    }}