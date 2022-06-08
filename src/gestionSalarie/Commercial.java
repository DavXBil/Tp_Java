package gestionSalarie;

public class Commercial extends Employe {

    String mission = "Trouver de nouveaux contacts";

    public Commercial(String name, String surname, String ssNumber, Address address) {
        super(name, surname, ssNumber, address);
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
}
