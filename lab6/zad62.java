import java.util.HashSet;
import java.util.Iterator;


public class zad62 {
    public static void main(String[] args) {
        HashSet<String> sett = new HashSet<>();
        sett.add("paper");
        sett.add("glass");
        sett.add("plastic");
        sett.add("bio");

        System.out.println(sett);

        Iterator<String> iterset = sett.iterator();
        String[] settable = new String[sett.size()];


        for (int i = 0; iterset.hasNext(); i++) {

            String element = iterset.next();
            settable[i] = element;
            System.out.println(i + ". " + settable[i]);
        }
    }
}

