package fr.diginamic.testenumeration;


public enum Continent {

    EUROPE("Europe"),
    AFRIQUE("Afrique"),
    AMERIQUE("Amérique"),
    ASIE("Asie"),
    OCEANIE("Océanie");

    String nom;

    Continent(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static Continent findByName(String nom) {

        for (Continent continent: values()) {
            if(continent.getNom().equals(nom)) {
                return continent;
            }
        }

        throw new IllegalArgumentException(nom);

    }
}
