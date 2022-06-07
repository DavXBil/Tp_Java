package fr.diginamic.banque.entites;

public class Debit extends Operation{


    @Override
    public String getType() {
        return "DEBIT";
    }

    public Debit(String operationDate, int operationAmount) {
        super(operationDate, operationAmount);
    }

}
