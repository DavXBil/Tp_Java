package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

    public static void main(String[] args) {

        ArrayList<Integer>intList = new ArrayList<>();

        intList.add(-1);
        intList.add(5);
        intList.add(7);
        intList.add(3);
        intList.add(-2);
        intList.add(4);
        intList.add(8);
        intList.add(5);

        System.out.println(intList);
        System.out.println(intList.size());
        System.out.println(Collections.max(intList));

        intList.remove(Collections.min(intList));

        System.out.println(intList);

        for (int i = 0; i < intList.size(); i++) {

            if (intList.get(i) < 0) {
                intList.set(i, Math.abs(intList.get(i))) ;
            }
        }

        System.out.println(intList);


    }
}
