package model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
    @Entity
    public class Mesaj {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String mesajIcerigi;
        public Mesaj() {
        }
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