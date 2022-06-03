package entites2;

import entites.AddressePostale;
public class Personne {

    public String name;
    public String surname;
    public AddressePostale address;

    public Personne(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Personne(String name, String surname, AddressePostale address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }


    public void toUppercaseName() {

        String str = "";
        str += this.name.toUpperCase();
        str += " " + this.surname.toUpperCase();

        System.out.println(str);
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }

    public void setAddress(String newStreetNumber, String newStreetName) {
        this.address.setStreetName(newStreetName);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
