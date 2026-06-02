package model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
    @Entity
    public class Mesaj {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String mesajIcerigi;
        @ManyToOne
        @JoinColumn(name = "kullanici_id")
        private User kullanici;

        @ManyToOne
        @JoinColumn(name = "sohbet_odasi_id")
        private SohbetOdasi sohbetOdasi;
        public Mesaj(String mesajIcerigi) {
            this.mesajIcerigi = mesajIcerigi;
        }
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getMesajIcerigi() {
            return mesajIcerigi;
        }
        public void setMesajIcerigi(String mesajIcerigi) {
            this.mesajIcerigi = mesajIcerigi;
        }
    }