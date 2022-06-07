package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {

        Compte account1 = new Compte(10, 1000000);
        CompteTaux accountRate = new CompteTaux(01, 02, 2);

        Compte[] accounts = new Compte[2];

        accounts[0] = account1;
        accounts[1] =accountRate;


        for (Compte account : accounts) {

            System.out.println(account.toString());
        }


    }

}
