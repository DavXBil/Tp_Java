package sets;

import fr.diginamic.testenumeration.Continent;

public class Pays {

    String nom;
    int nbHabitant;
    double pib;

    Continent continent;

    public Pays(String nom, int nbHabitant, double pib, Continent continent) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
        this.pib = pib;
        this.continent = continent;
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

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
