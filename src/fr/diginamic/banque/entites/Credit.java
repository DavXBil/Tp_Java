package fr.diginamic.banque.entites;

public class Credit extends Operation {

    @Override
    public String getType() {
        return "CREDIT";
    }

    public Credit(String operationDate, int operationAmount) {
        super(operationDate, operationAmount);
    }

}
