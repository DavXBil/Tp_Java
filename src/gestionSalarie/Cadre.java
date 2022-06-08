package gestionSalarie;

public class Cadre extends Employe  {

    final String mission = "Gérer les projets";

    public Cadre(String name, String surname, String ssNumber, Address address) {
        super(name, surname, ssNumber, address);
    }

    @Override
    public String getMission() {
        return mission;
    }
}
