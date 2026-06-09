package ekran;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class GirisEkran extends Application {
    @Override
    public void start(Stage anaEkran) {
        Label uygulamaAdi = new Label("WaveChat");
        uygulamaAdi.setStyle("-fx-font-size: 38px; -fx-font-weight: bold; -fx-text-fill: #d94f7c;");
        Label altBaslik = new Label("Gerçek Zamanlı Mesajlaşma Uygulaması");
        altBaslik.setStyle("-fx-font-size: 14px; -fx-text-fill: #6b6b6b;");
        TextField kullaniciGirisAlani = new TextField();
        kullaniciGirisAlani.setPromptText("Kullanıcı Adı");
        kullaniciGirisAlani.setMaxWidth(300);
        kullaniciGirisAlani.setStyle(
                "-fx-background-radius: 15;" +
                        "-fx-border-radius: 15;" +
                        "-fx-border-color: #f3b6c8;" +
                        "-fx-padding: 12;" +
                        "-fx-font-size: 14px;");
        PasswordField sifreGirisAlani = new PasswordField();
        sifreGirisAlani.setPromptText("Şifre");
        sifreGirisAlani.setMaxWidth(300);
        sifreGirisAlani.setStyle(
                "-fx-background-radius: 15;" +
                        "-fx-border-radius: 15;" +
                        "-fx-border-color: #f3b6c8;" +
                        "-fx-padding: 12;" +
                        "-fx-font-size: 14px;");
        Button girisYapButonu = new Button("Giriş Yap");
        girisYapButonu.setMaxWidth(300);
        girisYapButonu.setStyle(
                "-fx-background-color: #e75f8d;" +
                        "-fx-text-fill: white;" +
                        "-fx-font-size: 16px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 15;" +
                        "-fx-padding: 12;");
        Label sonucYazisi = new Label();
        sonucYazisi.setStyle("-fx-font-size: 13px; -fx-text-fill: #d94f7c;");
        girisYapButonu.setOnAction(e -> {
            String kullaniciAdi = kullaniciGirisAlani.getText();
            String sifre = sifreGirisAlani.getText();
            if (kullaniciAdi.equals("şehed") && sifre.equals("1409")) {
                sonucYazisi.setText("Giriş başarılı!");
                MesajEkrani mesajEkrani = new MesajEkrani();
                mesajEkrani.start(new Stage());
                anaEkran.close();
            } else {
                sonucYazisi.setText("Kullanıcı adı veya şifre hatalı!");
            }});
        VBox anaKutu = new VBox(15);
        anaKutu.setAlignment(Pos.CENTER);
        anaKutu.setPadding(new Insets(40));
        anaKutu.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #fff7fa, #fde4ec);");
        anaKutu.getChildren().addAll(
                uygulamaAdi,
                altBaslik,
                kullaniciGirisAlani,
                sifreGirisAlani,
                girisYapButonu,
                sonucYazisi);
        Scene sahne = new Scene(anaKutu, 450, 550);
        anaEkran.setTitle("WaveChat - Giriş");
        anaEkran.setScene(sahne);
        anaEkran.show();
    }
    public static void main(String[] dizi) {
        launch(dizi);
    }
}