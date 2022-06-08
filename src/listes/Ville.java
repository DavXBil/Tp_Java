package listes;

import java.util.ArrayList;

public class Ville implements Comparable<Ville> {

    String nom;
    int nombreHabitant;


    public String getNom() {
        return nom;
    }

    public int getNombreHabitant() {
        return nombreHabitant;
    }


    public Ville(String nom, int nombreHabitant) {
        this.nom = nom;
        this.nombreHabitant = nombreHabitant;
    }

    @Override
    public int compareTo(Ville ville) {

        return Long.compare(this.nombreHabitant, ville.getNombreHabitant());

    }

}

