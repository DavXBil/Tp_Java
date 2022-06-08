package tp_interfaces.difficile;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import tp_interfaces.difficile.CompteDaoMem;

public class TestComteDao {

    public static void displayMenu() {
        System.out.println("***** Administration des comptes ***** ");
        System.out.println("1. Lister les comptes");
        System.out.println("2. Ajouter un nouveau compte");
        System.out.println("3. Ajouter une opération à un compte");
        System.out.println("4. Supprimer un compte");
        System.out.println("99. Sortir");
    }

    public static void main(String[] args) {

        boolean isOut = false;

        Scanner scan = new Scanner(System.in);

        CompteDaoMem compteDao = new CompteDaoMem();


        while (!isOut) {

            displayMenu();

            String input = scan.next();

            switch (input) {

                case "1":
                    System.out.println("Liste des comptes");

                    List<Compte> accounts = compteDao.lister();

                    listAccounts(accounts);

                    break;

                case "2":
                    System.out.println("Ajout d’un nouveau compte");

                    System.out.println("Type de compte: 1:Normal, 2:Remunéré");
                    int newAccountType = scan.nextInt();
                    System.out.println("Numéro du nouveau compte");
                    int newAccountNum = scan.nextInt();
                    System.out.println("Solde du nouveau compte");
                    int newAmount = scan.nextInt();

                    Compte newAccount;

                    if (newAccountType == 1) {

                         newAccount = new Compte(newAccountNum, newAmount);

                        compteDao.sauvegarder(newAccount);

                    } else if (newAccountType == 2){

                        System.out.println("Taux du nouveau compte");

                        int newRate = scan.nextInt();

                        newAccount = new CompteTaux(newAccountNum, newAmount, newRate);

                        compteDao.sauvegarder(newAccount);
                    }

                    break;

                case "3":
                    System.out.println("Ajout d’une opération à un compte");
                    break;

                case "4":

                    System.out.println("Suppression d’un compte");

                    String toDeleteAccountNumber = scan.nextLine();

                    if(compteDao.existe(toDeleteAccountNumber)) {

                        boolean successfulRemoval = compteDao.supprimer(toDeleteAccountNumber);
                    }

                    break;

                case "99":
                    System.out.println("Au revoir ☹");
                    isOut = true;
                    break;
            }

        }

    }

    public static void listAccounts(List<Compte> accounts) {
        for (Compte account: accounts) {
            System.out.println("Numéro: " + account.getAccountNumber() + "; Solde: " + account.getAccountBalance());
        }


    }
}
