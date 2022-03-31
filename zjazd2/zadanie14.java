import java.util.Scanner;

public class zadanie14 {

    public static boolean czyPrawda (int x){
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int number = scanner.nextInt();


        if (czyPrawda(number)) {
            System.out.println("Liczba " + number + " jest parzysta");
        } else {
            System.out.println("Liczba " + number + " nie jest parzysta");
        }


    }
}
