package service;
import model.Mesaj;
import repository.MesajRepository;
import org.springframework.stereotype.Service;
@Service
public class MesajService {
    private MesajRepository mesajRepository;
    public MesajService(MesajRepository mesajRepository) {
        this.mesajRepository = mesajRepository;
    }
    public Mesaj mesajKaydet(Mesaj mesaj) {
        return mesajRepository.save(mesaj);
    }
}
