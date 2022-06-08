package listes;

import java.util.*;
import java.util.Iterator;

public class TestListString {


    public static void main(String[] args) {

        ArrayList<String>stringList = new ArrayList<>();

        stringList.add("Nice");
        stringList.add("Carcassonne");
        stringList.add("Narbonne");
        stringList.add("Lyon");
        stringList.add("Foix");
        stringList.add("Pau");
        stringList.add("Marseille");
        stringList.add("Tarbes");

        System.out.println(Collections.max(stringList, Comparator.comparing(String::length)));

        stringList.replaceAll(e -> e.toUpperCase());

        System.out.println(stringList);


        for (int i = 0; i < stringList.size(); i++) {

            if(stringList.get(i).toLowerCase(Locale.ROOT).startsWith("n") ) {

                stringList.remove(i);

            }
        }

        System.out.println(stringList);

    }

}
