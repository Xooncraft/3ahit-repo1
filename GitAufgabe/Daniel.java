package GitAufgabe;

public class Daniel {

    private String name;
    private double preis;

    public Daniel(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public double berechneRabatt(double rabbatInProzent) {
        double abzug = this.preis * (rabbatInProzent / 100);
        return this.preis - abzug;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Produkt: " + name + " kostet " + preis + "$";
    }
}
