package fr.diginamic.banque.entites;

public abstract class Operation {
    String operationDate;
    int operationAmount;

    public abstract String getType();


    public Operation(String operationDate, int operationAmount) {
        this.operationDate = operationDate;
        this.operationAmount = operationAmount;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public int getOperationAmount() {
        return operationAmount;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "operationDate='" + operationDate + '\'' +
                ", operationAmount=" + operationAmount +
                '}';
    }
}
