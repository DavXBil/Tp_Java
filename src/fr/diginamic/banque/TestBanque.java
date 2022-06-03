package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

    public static void main(String[] args) {

        Compte account1 = new Compte(10, 1000000);

        System.out.println(account1);
    }

}
