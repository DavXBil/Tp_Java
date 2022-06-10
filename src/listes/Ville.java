package listes;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return nombreHabitant == ville.nombreHabitant && Objects.equals(nom, ville.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nombreHabitant);
    }
}

