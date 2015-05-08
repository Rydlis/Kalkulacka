package sample;

/**
 * Created by david on 26.2.2015.
 */
public class vypocty {

    private String memory;
    private String znamenko;
    private double hodnota1;
    private double hodnota2;
    private double vysledek;

    dialogy dialog = new dialogy();

    public double vypocitej(){
        try {
            if (znamenko == "+"){
                vysledek = hodnota1 + hodnota2;
            }
            if (znamenko == "-"){
                vysledek = hodnota1 - hodnota2;
            }
            if (znamenko == "*"){
                vysledek = hodnota1 * hodnota2;
            }
            if (znamenko == "/"){
                vysledek = hodnota1 / hodnota2;
            }
            if(znamenko == "√") {
            vysledek = Math.sqrt(hodnota1);
            }
            if (znamenko == "±"){
                vysledek = hodnota1 * (-1);
            }
            if (znamenko == "/n"){
                vysledek = 1 / hodnota1;
            }
            if (znamenko == ""){
            dialog.Znamenko();
            }
        }catch (Exception e){
            dialog.Error();
        }
        znamenko = "";
        return vysledek;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setZnamenko(String znamenko) {
        this.znamenko = znamenko;
    }

    public double getHodnota1() {
        return hodnota1;
    }

    public void setHodnota1(double hodnota1) {
        this.hodnota1 = hodnota1;
    }

    public void setHodnota2(double hodnota2) {
        this.hodnota2 = hodnota2;
    }
}
