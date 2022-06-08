package sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class TestSetString {

    public static void main(String[] args) {

        HashSet<String> strings = new HashSet<String>();

        strings.add("USA");
        strings.add("France");
        strings.add("Allemagne");
        strings.add("UK");
        strings.add("Italie");
        strings.add("Japon");
        strings.add("Chine");
        strings.add("Russie");
        strings.add("Inde");

        String longest = Collections.max(strings, Comparator.comparing(String::length));

        System.out.println(longest);

        strings.remove(longest);

        System.out.println(strings);


    }

}
