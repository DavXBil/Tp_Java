package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    int tauxRemuneration;

    public CompteTaux(int accountNumber, int accountBalance, int tauxRemuneration) {
        super(accountNumber, accountBalance);
        this.tauxRemuneration = tauxRemuneration;

    }

    @Override
    public String toString() {
        return  super.toString() +
                " tauxRemuneration=" + this.tauxRemuneration;

    }
}
