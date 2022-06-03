package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        AddressePostale address1 = new AddressePostale("2", "rue du pif", "44000", "Nantes");

        Personne personne1 = new Personne("Aupif","Jean", address1);

        personne1.toUppercaseName();

        personne1.setName("Test");


    }



}
