 WaveChat - Gerçek Zamanlı Chat Uygulaması
 
1. Problem Tanımı
Günümüzde insanlar hızlı ve kolay bir şekilde iletişim kurmak istemektedir.
Bu projede kullanıcıların gerçek zamanlı olarak mesajlaşabilmesini sağlayan bir chat uygulaması geliştirilmiştir. 
Proje sayesinde kullanıcılar mesaj gönderebilir ve gönderilen mesajlar veritabanında saklanabilir.

2. Gereksinimler
Fonksiyonel Gereksinimler
Kullanıcı giriş yapabilmelidir.
Kullanıcı mesaj gönderebilmelidir.
Gönderilen mesajlar görüntülenebilmelidir.
Mesajlar veritabanına kaydedilmelidir.
Teknik Gereksinimler
Java
Spring Boot
JavaFX
MySQL
WebSocket
GitHub

3. Mimari Tasarım
Proje katmanlı mimari ile geliştirilmiştir.
Katmanlar:
Controller
Service
Repository
Model
Bu yapı sayesinde kod daha düzenli ve geliştirilebilir hale gelmiştir.

4. OOP Kullanımı
Projede nesne tabanlı programlama prensipleri kullanılmıştır.
Kullanılan sınıflar:
User
Mesaj
SohbetOdasi
Kapsülleme (Encapsulation) için değişkenler private olarak tanımlanmış ve getter-setter metotları kullanılmıştır.
Nesne kavramı User, Mesaj ve SohbetOdasi sınıflarından oluşturulan nesneler ile uygulanmıştır.
Soyutlama (Abstraction) WebSocket yapılandırmasında interface kullanılarak gerçekleştirilmiştir.
Katmanlı mimari sayesinde Controller, Service ve Repository sınıfları farklı görevlerde kullanılmıştır.

5. Veritabanı Tasarımı
Projede MySQL veritabanı kullanılmıştır.
Tablolar:
User
id
kullaniciAdi
sifre
eposta
Mesaj
id
mesajIcerigi
kullanici_id
sohbet_odasi_id
SohbetOdasi
id
odaAdi
İlişkiler:
Bir kullanıcı birden fazla mesaj gönderebilir.
Bir sohbet odasında birden fazla mesaj bulunabilir.
Mesaj tablosu kullanıcı ve sohbet odası ile ilişkilidir.

User:
id
kullaniciAdi
sifre
eposta

       1
       |
       |
       N

Mesaj:

id
mesajIcerigi
kullanici_id
sohbet_odasi_id

       N
       |
       |
       1

SohbetOdasi:

id
odaAdi

Bir kullanıcı birden fazla mesaj gönderebilir.
Bir sohbet odasında birden fazla mesaj bulunabilir.
Mesaj tablosu kullanıcı ve sohbet odası ile ilişkilidir.

6. CRUD Akışları
Projede CRUD işlemleri Controller, Service ve Repository katmanları kullanılarak gerçekleştirilmiştir.
Create (Oluşturma)
Mesaj gönderildiğinde MesajController isteği alır, MesajService işlemi gerçekleştirir ve MesajRepository veriyi veritabanına kaydeder.
Read (Okuma)
Kayıtlı mesajlar veritabanından okunabilir ve kullanıcıya gösterilebilir.
Update (Güncelleme)
Kullanıcı ve mesaj bilgileri güncellenebilir.
Delete (Silme)
Kayıtlı kullanıcılar veya mesajlar sistemden silinebilir.

7. Test Senaryoları
Senaryo 1
Kullanıcı doğru kullanıcı adı ve şifre ile giriş yapar.
Beklenen sonuç: Giriş başarılı olur.
Senaryo 2
Kullanıcı yanlış şifre girer.
Beklenen sonuç: Hata mesajı gösterilir.
Senaryo 3
Kullanıcı mesaj gönderir.
Beklenen sonuç: Mesaj veritabanına kaydedilir.
Senaryo 4
Veritabanı bağlantısı kapatılır.
Beklenen sonuç: Bağlantı hatası mesajı görüntülenir.
Senaryo 5
Kullanıcı boş mesaj göndermeye çalışır.
Beklenen sonuç: Mesaj gönderilmez.

8. Sonuç ve Değerlendirme
Bu projede Java, Spring Boot, JavaFX, MySQL ve WebSocket teknolojileri kullanılarak gerçek zamanlı bir chat uygulaması geliştirilmiştir.
Proje sayesinde kullanıcılar sisteme giriş yapabilmekte, mesaj gönderebilmekte ve mesajlar veritabanında saklanabilmektedir.
Katmanlı mimari kullanılması kodun daha düzenli, okunabilir ve geliştirilebilir olmasını sağlamıştır.
Bu proje geliştirilmeye açıktır. İleride kullanıcı kayıt sistemi, özel sohbet odaları, JWT güvenliği ve grup sohbetleri gibi özellikler eklenebilir.

9. Kaynakça
Spring Boot Resmi Dokümantasyonu
JavaFX Resmi Dokümantasyonu
MySQL Resmi Dokümantasyonu
Oracle Java Dokümantasyonu
GitHub Dokümantasyonu
