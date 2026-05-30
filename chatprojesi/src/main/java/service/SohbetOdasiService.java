package service;
import model.SohbetOdasi;
import repository.SohbetOdasiRepository;
public class SohbetOdasiService {
    private SohbetOdasiRepository sohbetOdasiRepository;
    public SohbetOdasiService(SohbetOdasiRepository sohbetOdasiRepository) {
        this.sohbetOdasiRepository = sohbetOdasiRepository;
    }
    public SohbetOdasi sohbetOdasiKaydet(SohbetOdasi sohbetOdasi) {
        return sohbetOdasiRepository.save(sohbetOdasi);
    }
}