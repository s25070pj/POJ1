
import java.util.Iterator;
import java.util.TreeSet;

public class zad63 {
    public static void main(String[] args) {

        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("blue");
        tree1.add("red");
        tree1.add("green");
        tree1.add("yellow");
        tree1.add("black");
        System.out.println(tree1);

        Iterator<String> tree1iter = tree1.iterator();
        while (tree1iter.hasNext()){
            System.out.println(tree1iter.next());
        }

        TreeSet<String> tree2 = new TreeSet<>();
             tree2.add("white");
             tree2.add("blue");
             tree2.add("silver");
        System.out.println(tree2);

        tree1.addAll(tree2);
        System.out.println(tree1);


   /*     Iterator<String> tree1iter2 = tree1.iterator();
        String tree1table[] = new String[tree1.size()];
        for (int i = 0; tree1iter2.hasNext(); i++) {
            tree1table[i] = tree1iter2.next();
        }
        for (int i = tree1.size()-1; i >= 0; i--){
            System.out.println(tree1table[i]);
        }

    */
        System.out.println(tree1.descendingSet());

        System.out.println(tree1.first() + tree1.last());

        TreeSet<String> tree3 = new TreeSet<>();
        tree3 = ((TreeSet<String>) tree1.clone());
        System.out.println(tree3);

        System.out.println(tree3.size());

        System.out.println(tree1.equals(tree2));
    }
}
