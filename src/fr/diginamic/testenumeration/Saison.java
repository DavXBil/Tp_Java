package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private String nom;
    private int ordre;

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    Saison(String nom, int ordre) {
        this.nom = nom;
        this.ordre = ordre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static Saison findByName(String nom) {

        for (Saison saison: values()) {
            if(saison.getNom().equals(nom)) {
                return saison;
            }
        }

        throw new IllegalArgumentException(nom);

    }

}
