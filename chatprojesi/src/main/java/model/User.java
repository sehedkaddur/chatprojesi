package model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String kullaniciAdi;
    private String sifre;
    private String eposta;
    @OneToMany(mappedBy = "kullanici")
    private List<Mesaj> mesajlar;
    public Long getId() {
        return id;}
    public void setId(Long id) {
        this.id = id;
    }
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
    public String getSifre() {
        return sifre;
    }
    public void setSifre(String sifre) {
        this.sifre = sifre;}
    public String getEposta() {
        return eposta;}
    public void setEposta(String eposta) {
        this.eposta = eposta;}}