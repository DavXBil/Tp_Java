package gestionSalarie;

public abstract class Personne {

    protected String name;
    protected String surname;
    protected String ssNumber;
    protected Address address;
    protected Contact contactPerso;
    protected ContactProfessionnel contactPro;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public Contact getContactPerso() {
        return contactPerso;
    }

    public void setContactPerso(Contact contactPerso) {
        this.contactPerso = contactPerso;
    }

    public ContactProfessionnel getContactPro() {
        return contactPro;
    }

    public void setContactPro(ContactProfessionnel contactPro) {
        this.contactPro = contactPro;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSsNumber() {
        return ssNumber;
    }

    public void setSsNumber(String ssNumber) {
        this.ssNumber = ssNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
