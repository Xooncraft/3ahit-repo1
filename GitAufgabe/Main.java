package GitAufgabe;

public class Main {
    public static void main(String[] args) {

        Daniel meinHandy = new Daniel("Samsung Galaxy S23 FE", 800.0);

        System.out.println(meinHandy.toString());

        double endPreis = meinHandy.berechneRabatt(10.0);

        System.out.println("Preis nach Rabatt: " + endPreis + "$");



        Julia kurs = new Julia("Hip-Hop", 12);

        System.out.println("Kosten: " + kurs.kostenBerechnen(15));
        System.out.println("Freie Plätze: " + kurs.freiePlaetze(20));
        System.out.println("Kurs voll? " + kurs.kursVoll(20));



        Zaina buch = new Zaina("Harry Potter", "J.K. Rowling");

        System.out.println(buch.ausleihen("Zaina"));
    }
}
