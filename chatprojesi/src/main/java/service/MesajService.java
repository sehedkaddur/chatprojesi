package service;
import model.Mesaj;
import repository.MesajRepository;
public class MesajService {
    private MesajRepository mesajRepository;
    public MesajService(MesajRepository mesajRepository) {
        this.mesajRepository = mesajRepository;
    }
    public Mesaj mesajKaydet(Mesaj mesaj) {
        return mesajRepository.save(mesaj);
    }
}