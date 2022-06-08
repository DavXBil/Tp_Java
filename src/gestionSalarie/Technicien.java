package gestionSalarie;

public class Technicien extends Employe {

    String mission = "Fabriquer et contrôler les produits de l’entreprise ";

    public Technicien(String name, String surname, String ssNumber, Address address) {
        super(name, surname, ssNumber, address);
    }
}
