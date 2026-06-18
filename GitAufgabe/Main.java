package GitAufgabe;

public class Main {
     public static void main(String[] args){

          Daniel meinHandy = new Daniel("Samsung Galaxy S23 FE", 800.0);

          System.out.println(meinHandy.toString());

          double endPreis = meinHandy.berechneRabatt(10.0);

          System.out.println("Preis nach Rabatt: " + endPreis + "$");
     }
}
