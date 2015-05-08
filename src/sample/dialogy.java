package sample;

import javafx.scene.control.Alert;

/**
 * Created by david on 26.2.2015.
 */
public class dialogy {

    Alert alert = new Alert(Alert.AlertType.ERROR);
    Alert info = new Alert(Alert.AlertType.INFORMATION);

    public void Nefunguje(){
        alert.setTitle("Ouha! :(");
        alert.setHeaderText("Kalkulačka zaznamenala nějakou chybu");
        alert.setContentText("Kalkulačka bud'to neumí tuhle tu funkci nebo nemá svůj den.");
        alert.showAndWait();
    }

    public void Error() {
        alert.setTitle("Error! :(");
        alert.setHeaderText("Písmenka, znaky a alkohol do matematiky nepatří!");
        alert.showAndWait();
    }

    public void Tecka() {
        alert.setTitle("Error! :(");
        alert.setHeaderText("Uz tam jedna tecka je!");
        alert.showAndWait();
    }

    public void Mat_Error() {
        alert.setTitle("Matematicky error :(");
        alert.setHeaderText("Je vysoce pravdepodobne ze doslo k chybe kterou tato kalkulacka neumi zpracovat\nKalkulacka bude normalne pokracovat v praci ;)");
        alert.showAndWait();
    }

    public void Znamenko() {
        alert.setTitle("Error! :(");
        alert.setHeaderText("Zadej prosim pocetni operaci!");
        alert.showAndWait();
    }

    public void Informace(){
        info.setTitle("Informace");
        info.setHeaderText("Sepsano Davidem Rejdlem za podpory kavy a marshmallow");
        info.showAndWait();
    }
}
