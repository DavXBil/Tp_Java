package gestionSalarie;

public class Commercial extends Employe {

    final String mission = "Trouver de nouveaux contacts";

    public Commercial(String name, String surname, String ssNumber, Address address) {
        super(name, surname, ssNumber, address);
    }

    @Override
    public String getMission() {
        return mission;
    }
}
