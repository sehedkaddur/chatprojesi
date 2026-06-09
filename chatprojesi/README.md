Gerçek Zamanlı Chat Uygulaması

1.Proje Amacı:
Bu proje, Java Spring Boot ve MySQL kullanılarak geliştirilmiş gerçek zamanlı sohbet uygulamasıdır. Kullanıcı yönetimi, mesaj yönetimi ve sohbet odası yönetimi işlemlerini gerçekleştirmektedir.

2.Kullanılan Teknolojiler:
Java
Spring Boot
MySQL
JPA / Hibernate
Maven
JavaFX
GitHub

3.Kurulum:
.MySQL üzerinde `chatdb` veritabanını oluşturun.
.application.properties dosyasındaki veritabanı bilgilerini düzenleyin.
.Maven bağımlılıklarını yükleyin.
.Projeyi çalıştırın.

4.Çalıştırma:
Projeyi çalıştırmak için:
ChatprojesiApplication.java dosyasını çalıştırın.
Uygulama varsayılan olarak 8080 portunda çalışır.

5.Özellikler:
Kullanıcı kayıt işlemleri
Mesaj kayıt işlemleri
Sohbet odası kayıt işlemleri
MySQL veritabanı desteği
Katmanlı mimari yapısı

6.ER Diyagramı:
Kullanici:
id
kullanici_adi
sifre
eposta

Mesaj:
id
mesaj_icerigi

SohbetOdasi:
id 
oda_adi

7.API Örnekleri:
POST /kullanici/kaydet
POST /mesaj/kaydet
POST /sohbetodasi/kaydet

8.Bilinen Sorunlar:
Backend çalışmadan JavaFX ekranı açılırsa mesaj gönderilemez.
Veritabanı bağlantısı yanlış yapılandırılırsa kayıt işlemleri başarısız olabilir.

9.Gelecek Geliştirmeler:
Kullanıcı kayıt ekranı eklenebilir.
Grup sohbet sistemi geliştirilebilir.
JWT tabanlı güvenlik sistemi eklenebilir.
Dosya ve resim gönderme özelliği eklenebilir.

10.Katmanlı Mimari:
Proje aşağıdaki katmanlardan oluşmaktadır:
Controller → Service → Repository → MySQL
Bu yapı sayesinde kod daha düzenli ve geliştirilebilir hale gelmiştir.

