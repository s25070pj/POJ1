package ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Coffe {
    public static void main(String[] args) {

        ArrayList<String> types = new ArrayList<String>();
        types.add("espresso");
        types.add("latte");
        types.add("cappuccino");
        types.add("mocha");
        types.add("auLait");
        types.add("macchiato");

        //wypisanie b)
        System.out.println(types);


        //wypisanie c)
        Iterator<String> typesIndex = types.iterator();
        for (int i = 0; i <= 5; i++) {
            System.out.println(typesIndex.next());
        }


        // wypisanie d
        for (String i : types) {
            System.out.println(i.toUpperCase(Locale.ROOT));
        }
        // types.forEach((i) -> System.out.println(i.toUpperCase(Locale.ROOT)));


        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(types.get(i).charAt(j));
            }
            System.out.println();
        }

    }
}
