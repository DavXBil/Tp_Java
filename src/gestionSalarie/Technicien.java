package gestionSalarie;

public class Technicien extends Employe {

    final String mission = "Fabriquer et contrôler les produits de l’entreprise ";

    public Technicien(String name, String surname, String ssNumber, Address address) {
        super(name, surname, ssNumber, address);
    }

    @Override
    public String getMission() {
        return mission;
    }
}
