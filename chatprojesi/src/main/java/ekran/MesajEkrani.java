package ekran;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
public class MesajEkrani extends Application {
    @Override
    public void start(Stage anaPencere) {
        TextField mesajYazmaAlani = new TextField();
        Button mesajGonderButonu = new Button("Gönder");
        TextArea mesajListesi = new TextArea();
        mesajListesi.setEditable(false);
        mesajGonderButonu.setOnAction(e -> {
            String yazilanMesaj = mesajYazmaAlani.getText();
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
                    mesajListesi.appendText(yazilanMesaj + "\n");
                    mesajYazmaAlani.clear();
                } else {
                    mesajListesi.appendText("Mesaj kaydedilemedi.\n");
                }
                baglanti.disconnect();
            } catch (Exception hata) {
                mesajListesi.appendText("Bağlantı hatası oluştu.\n");
            }
        });
        VBox anaKutu = new VBox();
        anaKutu.getChildren().addAll(
                mesajYazmaAlani,
                mesajGonderButonu,
                mesajListesi
        );
        Scene sohbetSahnesi = new Scene(anaKutu, 400, 300);
        anaPencere.setTitle("Sohbet Odası");
        anaPencere.setScene(sohbetSahnesi);
        anaPencere.show();}
    public static void main(String[] args) {
        launch(args);}}
