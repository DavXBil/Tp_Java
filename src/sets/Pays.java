package sets;

public class Pays {

    String nom;
    int nbHabitant;
    double pib;

    public Pays(String nom, int nbHabitant, double pib) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
        this.pib = pib;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbHabitant(int nbHabitant) {
        this.nbHabitant = nbHabitant;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public double getPib() {
        return pib;
    }
}
