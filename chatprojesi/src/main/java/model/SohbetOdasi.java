package model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
@Entity
public class SohbetOdasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String odaAdi;
    @OneToMany(mappedBy = "sohbetOdasi")
    private List<Mesaj> mesajlar;
    public SohbetOdasi() {}
    public SohbetOdasi(String odaAdi) {
        this.odaAdi = odaAdi;}
    public Long getId() {
        return id;}
    public void setId(Long id) {
        this.id = id;}
    public String getOdaAdi() {
        return odaAdi;}
    public void setOdaAdi(String odaAdi) {
        this.odaAdi = odaAdi;}}

