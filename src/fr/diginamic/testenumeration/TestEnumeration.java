package fr.diginamic.testenumeration;

import sets.Pays;

import java.util.*;

public class TestEnumeration {

    public static void main(String[] args) {

        Saison[] saisons = Saison.values();


        for (Saison saison: saisons) {
            System.out.println(saison.getOrdre() + "-" + saison.getNom());
        }

        System.out.println(Saison.valueOf("ETE").getNom());

        System.out.println(Saison.findByName("Hiver"));

        List<Pays> listPays = new ArrayList<>();

        Collections.addAll(listPays,
            new Pays("Maroc", 1000, 1, Continent.AFRIQUE),
            new Pays("Gabon", 1000, 1, Continent.AFRIQUE),
            new Pays("Australie", 1000, 1, Continent.OCEANIE),
            new Pays("France", 1000, 1, Continent.EUROPE),
            new Pays("Pologne", 1000, 1, Continent.EUROPE),
            new Pays("Argentine", 1000, 1, Continent.AMERIQUE),
            new Pays("Japon", 1000, 1, Continent.ASIE)
        );

        Map<Continent, Integer> paysParContinent = new HashMap<>();

        for (Continent continent: Continent.values()) {

            paysParContinent.put(continent, 0);

        }

        for (Pays pays : listPays) {

            int nbPays = paysParContinent.get(pays.getContinent()) + 1;

            paysParContinent.put(pays.getContinent(), nbPays);

        }

        System.out.println(paysParContinent);

    }

}
