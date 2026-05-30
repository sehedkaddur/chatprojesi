package ekran;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class MesajEkrani extends Application {
    @Override
    public void start(Stage anaPencere) {
        TextField mesajYazmaAlani = new TextField();
        Button mesajGonderButonu = new Button("Gönder");
        TextArea mesajListesi = new TextArea();
        mesajListesi.setEditable(false);
        mesajGonderButonu.setOnAction(e -> {
            String yazilanMesaj = mesajYazmaAlani.getText();
            mesajListesi.appendText(yazilanMesaj + "\n");
            mesajYazmaAlani.clear();
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
