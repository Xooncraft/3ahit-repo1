package GitAufgabe;
//DANIEL WAR HIER :D
//ZAINA WAR HIER <3
public class Julia {

    private String tanzstil;
    private int teilnehmer;

    public Julia(String tanzstil, int teilnehmer) {
        this.tanzstil = tanzstil;
        this.teilnehmer = teilnehmer;
    }

    public double kostenBerechnen(double preisProPerson) {
        return teilnehmer * preisProPerson;
    }

    public int freiePlaetze(int maximaleTeilnehmer) {
        return maximaleTeilnehmer - teilnehmer;
    }

    public boolean kursVoll(int maximaleTeilnehmer) {
        return teilnehmer >= maximaleTeilnehmer;
    }
}
