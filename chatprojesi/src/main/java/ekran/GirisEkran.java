package ekran;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
public class GirisEkran extends Application {
    @Override
    public void start(Stage anaEkran) {
        GridPane izgara = new GridPane();
        Label kullaniciAdiYazi = new Label("Kullanıcı Adı:");
        TextField kullaniciGirisAlani = new TextField();
        Label sifreYazisi = new Label("Şifre:");
        PasswordField sifreGirisAlani = new PasswordField();
        Button girisYapButonu = new Button("Giriş Yap");
        Label sonucYazisi = new Label();

        girisYapButonu.setOnAction(e -> {
            String kullaniciAdi = kullaniciGirisAlani.getText();
            String sifre = sifreGirisAlani.getText();
            if (kullaniciAdi.equals("şehed") && sifre.equals("2006")) {
                sonucYazisi.setText("Giriş başarılı!");
            }
            else {
                sonucYazisi.setText("Kullanıcı adı veya şifre hatalı!");
            }});

        izgara.add(kullaniciAdiYazi, 0 , 0);
        izgara.add(kullaniciGirisAlani , 1, 0);
        izgara.add(sifreYazisi,0,1);
        izgara.add(sifreGirisAlani,1 , 1);
        izgara.add(girisYapButonu , 1 , 2);
        izgara.add(sonucYazisi, 1, 3);
        Scene sahne = new Scene(izgara , 350, 200);
        anaEkran.setTitle("Chat Giriş Ekranı");
        anaEkran.setScene(sahne);
        anaEkran.show();}
    public static void main(String[] dizi) {
        launch(dizi);
    }}