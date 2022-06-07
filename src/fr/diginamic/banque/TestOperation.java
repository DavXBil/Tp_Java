package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.util.Objects;

public class TestOperation {


    public static void main(String[] args) {

        int amount = 0;

        Operation[] operations = new Operation[4];

        operations[0] = new Credit("01/02/2000", 20);
        operations[1] = new Debit("01/02/2000", 10);
        operations[2] = new Credit("01/02/2000", 50);
        operations[3] = new Debit("01/02/2000", 30);

        for (Operation operation: operations) {
            System.out.println(operation.toString());
            System.out.println(operation.getType());

            if (Objects.equals(operation.getType(), "CREDIT")) {
                amount += operation.getOperationAmount();
            } else if (Objects.equals(operation.getType(), "DEBIT")) {
                amount -= operation.getOperationAmount();
            }

            System.out.println(amount);

        }
    }







}

