import java.util.LinkedList;

public class zad61 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("paper");
        list.add("glass");
        list.add("plastic");
        list.add("bio");



        System.out.println("The oryginal linked list: " + list);
        System.out.println("Element removed: "+ list.remove(1));
        System.out.println("Element removed: "+ list.removeFirst());
        System.out.println("The new linked list: " + list);

    }
}
