package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField display;
    public Button MC;
    public Button MR;
    public Button MCplus;
    public Button MCminus;
    public Button MS;
    public Button procento;
    public Button odmocnina;
    public Button zlomek;
    public Button secti;
    public Button odecti;
    public Button vynasob;
    public Button vydel;
    public Button vypocitej;
    public Button vymaz;
    public Button vymaz_cele;
    public Button negace;
    public Button tecka;
    public Button num1;
    public Button num2;
    public Button num3;
    public Button num4;
    public Button num5;
    public Button num6;
    public Button num7;
    public Button num8;
    public Button num9;
    public Button num0;
    public Label label;
    public String display_text = "";
    public double display_number = 0;
    public int Pridanatecka = 0;

    dialogy notif = new dialogy();
    vypocty vypocty = new vypocty();

    /*
     * ---- dodelat efekty prejeti mysi
     */

    /* --------------- obsluha pameti ---------------*/
    public void handleSaveMemory(ActionEvent event){
        try {
            display_text = display.getText();
            vypocty.setMemory(display_text);
        }catch (Exception e){
            notif.Mat_Error();
        }
    }

    public void handleMemoryPlus(ActionEvent event){
        try {
            display_number = (Double.parseDouble(vypocty.getMemory()) + Double.parseDouble(display.getText()));
            display.setText(String.valueOf(display_number));
        }catch (Exception e){
            notif.Mat_Error();
        }
    }

    public void handleMemoryMinus(ActionEvent event){
        try {
            display_number = (Double.parseDouble(vypocty.getMemory()) - Double.parseDouble(display.getText()));
            display.setText(String.valueOf(display_number));
        }catch (Exception e){
            notif.Mat_Error();
        }
    }

    public void handleMemoryClear(ActionEvent event){
        try {
            vypocty.setMemory("");
        }catch (Exception e){
            notif.Mat_Error();
        }
    }

    public void handlePrintMemory (ActionEvent event) {
        try {
            display.setText(vypocty.getMemory());
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec obsluhy pameti --------------- */

    /* --------------- scitani --------------- */
    public void handleSecistEvent (ActionEvent event){
        try {
            vypocty.setHodnota1(Double.parseDouble(display.getText()));
            vypocty.setZnamenko("+");
            display.clear();
            label.setText(vypocty.getHodnota1() + " + ");
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec scitani --------------- */

    /* --------------- odcitani --------------- */
    public void handleOdecistEvent (ActionEvent event){
        try {
            vypocty.setHodnota1(Double.parseDouble(display.getText()));
            vypocty.setZnamenko("-");
            display.clear();
            label.setText(vypocty.getHodnota1() + " - ");
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec scitani --------------- */

    /* --------------- nasobeni --------------- */
    public void handleVynasobEvent (ActionEvent event){
        try {
            vypocty.setHodnota1(Double.parseDouble(display.getText()));
            vypocty.setZnamenko("*");
            display.clear();
            label.setText(vypocty.getHodnota1() + " * ");
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec scitani --------------- */

    /* --------------- deleni --------------- */
    public void handleVydelEvent (ActionEvent event){
        try {
            vypocty.setHodnota1(Double.parseDouble(display.getText()));
            vypocty.setZnamenko("/");
            display.clear();
            label.setText(vypocty.getHodnota1() + " / ");
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec deleni --------------- */

    /* --------------- zlomek --------------- */
    public void handleZlomekEvent (ActionEvent event){
        try {
            vypocty.setHodnota1(Double.parseDouble(display.getText()));
            vypocty.setZnamenko("/n");
            display.clear();
            display.setText("1/" + vypocty.getHodnota1());
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec zlomku --------------- */

    /* --------------- odmocnina --------------- */
    public void handleOdmocninaEvent (ActionEvent event){
        try {
            vypocty.setHodnota1(Double.parseDouble(display.getText()));
            vypocty.setZnamenko("√");
            display.clear();
            display.setText("√" + vypocty.getHodnota1());
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec odmocnina --------------- */

    /* --------------- negace --------------- */
    public void handleNegaceEvent (ActionEvent event){
        try {
            vypocty.setHodnota1(Double.parseDouble(display.getText()));
            vypocty.setZnamenko("±");
            display.clear();
            display.setText("±" + vypocty.getHodnota1());
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec negace --------------- */

    /* --------------- pridani tecky --------------- */
    public void handleAddTecka(ActionEvent event) {
        try {
            if (Pridanatecka == 0) {
                display_text = (display.getText() + ".");
                display.clear();
                display.setText(display_text);
                Pridanatecka = 1;
            } else {
                notif.Tecka();
            }
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec pridani tecky --------------- */

    /* --------------- pridavani cisla --------------- */
    public void handleAddNumber (ActionEvent event){
        try {
            if (event.getSource() == num0) {
                display_text = (display.getText() + "0");
                display.clear();
                display.setText(display_text);
            } else if (event.getSource() == num1) {
                display_text = (display.getText() + "1");
                display.clear();
                display.setText(display_text);
            } else if (event.getSource() == num2) {
                display_text = (display.getText() + "2");
                display.clear();
                display.setText(display_text);
            } else if (event.getSource() == num3) {
                display_text = (display.getText() + "3");
                display.clear();
                display.setText(display_text);
            } else if (event.getSource() == num4) {
                display_text = (display.getText() + "4");
                display.clear();
                display.setText(display_text);
            } else if (event.getSource() == num5) {
                display_text = (display.getText() + "5");
                display.clear();
                display.setText(display_text);
            } else if (event.getSource() == num6) {
                display_text = (display.getText() + "6");
                display.clear();
                display.setText(display_text);
            } else if (event.getSource() == num7) {
                display_text = (display.getText() + "7");
                display.clear();
                display.setText(display_text);
            } else if (event.getSource() == num8) {
                display_text = (display.getText() + "8");
                display.clear();
                display.setText(display_text);
            } else if (event.getSource() == num9) {
                display_text = (display.getText() + "9");
                display.clear();
                display.setText(display_text);
            }
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec pridavani cisla --------------- */

    /* --------------- clear --------------- */
    public void handleClearEvent (ActionEvent event){
        try {
            display.clear();
            label.setText("");
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec clear --------------- */

    /* --------------- clear display --------------- */
    public void hadleClearDisplay (ActionEvent event){
        try {
            display.clear();
        }catch (Exception e){
            notif.Nefunguje();
        }
    }
    /* --------------- konec clear display --------------- */

    /* --------------- rovna se --------------- */
    public void handleVypocitejEvent (ActionEvent event){
        try {
            vypocty.setHodnota2(Double.parseDouble(display.getText()));
            display.clear();
            display.setText(String.valueOf(vypocty.vypocitej()));
            Pridanatecka = 0;
        }catch (Exception e){
            notif.Mat_Error();
        }
    }
    /* --------------- konec rovna se --------------- */

    /* --------------- obsluha erroru --------------- */
    public void handleNefunkcniEvent (ActionEvent event){
        notif.Nefunguje();
    }

    public void handleErrorEvent (ActionEvent event) {
        notif.Error();
    }
    /* --------------- konec obsluhy erroru --------------- */

    /* --------------- zacatek konce --------------- */
    public void handleKonecEvent (ActionEvent event){
        System.exit(0);
    }
    /* --------------- konec konce --------------- */

    /* --------------- zacatek napovedy --------------- */
    public void handleInformaceEvent (ActionEvent event){
        notif.Informace();
    }
    /* --------------- konec napovedy --------------- */
}