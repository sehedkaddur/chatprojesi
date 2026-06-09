package ekran;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
public class MesajEkrani extends Application {
    @Override
    public void start(Stage anaPencere) {
        Label baslik = new Label("WaveChat");
        baslik.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-text-fill: #d94f7c;");
        Label altBaslik = new Label("Gerçek Zamanlı Sohbet Odası");
        Label kullaniciBilgisi = new Label("Hoş geldin, sehed");
        kullaniciBilgisi.setStyle("-fx-font-size: 13px; -fx-text-fill: #555555;");
        altBaslik.setStyle("-fx-font-size: 14px; -fx-text-fill: #777777;");
        TextArea mesajListesi = new TextArea();
        mesajListesi.setEditable(false);
        mesajListesi.setPromptText("Mesajlar burada görünecek...");
        mesajListesi.setStyle(
                "-fx-background-radius: 15;" +
                        "-fx-border-radius: 15;" +
                        "-fx-border-color: #f3b6c8;" +
                        "-fx-font-size: 14px;" +
                        "-fx-control-inner-background: #fff7fa;"
        );
        TextField mesajYazmaAlani = new TextField();
        mesajYazmaAlani.setPromptText("Mesajınızı yazın...");
        mesajYazmaAlani.setStyle(
                "-fx-background-radius: 15;" +
                        "-fx-border-radius: 15;" +
                        "-fx-border-color: #f3b6c8;" +
                        "-fx-padding: 10;" +
                        "-fx-font-size: 14px;"
        );
        Button mesajGonderButonu = new Button("Gönder");
        mesajGonderButonu.setStyle(
                "-fx-background-color: #e75f8d;" +
                        "-fx-text-fill: white;" +
                        "-fx-font-size: 14px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 15;" +
                        "-fx-padding: 10 25 10 25;");
        Label durumYazisi = new Label("Durum: Bağlandı");
        durumYazisi.setStyle("-fx-text-fill: #6b6b6b; -fx-font-size: 12px;");
        mesajGonderButonu.setOnAction(e -> {
            String yazilanMesaj = mesajYazmaAlani.getText();
            if (yazilanMesaj.isEmpty()) {
                durumYazisi.setText("Durum: Boş mesaj gönderilemez.");
                return;
            }
            try {
                URL adres = new URL("http://localhost:8080/mesaj/kaydet");
                HttpURLConnection baglanti = (HttpURLConnection) adres.openConnection();
                baglanti.setRequestMethod("POST");
                baglanti.setRequestProperty("Content-Type", "application/json");
                baglanti.setDoOutput(true);
                String jsonVeri = "{\"mesajIcerigi\":\"" + yazilanMesaj + "\"}";
                OutputStream veriAkisi = baglanti.getOutputStream();
                veriAkisi.write(jsonVeri.getBytes());
                veriAkisi.flush();
                veriAkisi.close();
                int gelenYanit = baglanti.getResponseCode();
                if (gelenYanit == 200) {
                    mesajListesi.appendText("Sen: " + yazilanMesaj + "\n");
                    mesajYazmaAlani.clear();
                    durumYazisi.setText("Durum: Mesaj kaydedildi.");
                } else {
                    mesajListesi.appendText("Mesaj kaydedilemedi.\n");
                    durumYazisi.setText("Durum: Mesaj kaydedilemedi.");
                }
                baglanti.disconnect();
            } catch (Exception hata) {
                mesajListesi.appendText("Bağlantı hatası oluştu.\n");
                durumYazisi.setText("Durum: Backend bağlantısı yok.");
            }});
        HBox mesajKutusu = new HBox(10);
        mesajKutusu.setAlignment(Pos.CENTER);
        HBox.setHgrow(mesajYazmaAlani, Priority.ALWAYS);
        mesajKutusu.getChildren().addAll(mesajYazmaAlani, mesajGonderButonu);
        VBox anaKutu = new VBox(15);
        anaKutu.setPadding(new Insets(25));
        anaKutu.setStyle("-fx-background-color: linear-gradient(to bottom, #fff7fa, #fde4ec);");
        VBox.setVgrow(mesajListesi, Priority.ALWAYS);
        anaKutu.getChildren().addAll(
                baslik,
                altBaslik,
                kullaniciBilgisi,
                mesajListesi,
                mesajKutusu,
                durumYazisi
        );
        Scene sohbetSahnesi = new Scene(anaKutu, 650, 520);
        anaPencere.setTitle("WaveChat - Sohbet Odası");
        anaPencere.setScene(sohbetSahnesi);
        anaPencere.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}