package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FusionListe {

        public static void main(String args[]) {

                List<String>liste1 = new ArrayList<String>();
                liste1.add("Rouge");
                liste1.add("Vert");
                liste1.add("Orange");

                List<String>liste2 = new ArrayList<String>();
                liste2.add("Blanc");
                liste2.add("Bleu");
                liste2.add("Orange");

                Iterator<String> ite1 = liste1.iterator();
                Iterator<String> ite2 = liste2.iterator();

                List<String>liste3 = new ArrayList<String>();

                while(ite1.hasNext()) {
                        liste3.add(ite1.next());
                }
                while(ite2.hasNext()) {
                        liste3.add(ite2.next());
                }

                System.out.println(liste3);

        }
}

