package gestionSalarie;

public class ContactProfessionnel extends Contact {

    String service;
    Address societyAddress;

    public ContactProfessionnel(String phoneNumber, String mail, String service, Address societyAddress) {
        super(phoneNumber, mail);
        this.service = service;
        this.societyAddress = societyAddress;
    }
}
