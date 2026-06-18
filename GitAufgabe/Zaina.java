package GitAufgabe;

public class Zaina {

    private String titel;
    private String autor;

    public Zaina(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
    }

    public String ausleihen(String name) {
        return name + " hat das Buch \"" + titel + "\" ausgeliehen.";
    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }
}
