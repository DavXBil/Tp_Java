package fr.diginamic.banque.entites;

public class Compte {

    private int accountNumber;
    private int accountBalance;

    public Compte(int accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
