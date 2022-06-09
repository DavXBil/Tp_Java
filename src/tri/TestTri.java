package tri;

import tri.Ville;

import java.util.*;

public class TestTri {

    public static void main(String[] args) {

        ArrayList<tri.Ville> villes = new ArrayList<tri.Ville>();

        Collections.addAll(villes,
                new tri.Ville("Nice", 343000),
                new tri.Ville("Carcassonne", 47800),
                new tri.Ville("Narbonne", 53400),
                new tri.Ville("Lyon", 484000),
                new tri.Ville("Foix", 9700),
                new tri.Ville("Pau", 77200),
                new tri.Ville("Marseille", 850700),
                new tri.Ville("Tarbes", 40600)
        );


        Collections.sort(villes, new ComparatorHabitant());

        System.out.println(villes);

        Collections.sort(villes, new ComparatorNom());

        System.out.println(villes);

    }


}
