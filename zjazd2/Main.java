package com.company;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            String imie, nazwisko, kierunek;
            int grupa;

            Scanner scanner = new Scanner(System.in);
            Scanner scannerInt = new Scanner(System.in);

            System.out.println("Podaj imie ");
            imie = scanner.nextLine();

            System.out.println("Podaj nazwisko ");
            nazwisko = scanner.nextLine();

            System.out.println("Podaj grupe ");
            grupa = scannerInt.nextInt();

            System.out.println("Podaj kierunek ");
            kierunek = scanner.nextLine();


            System.out.println("imie: " + imie );
            System.out.println("nazwisko: " + nazwisko);
            System.out.println("grupa: " + grupa);
            System.out.println("kierunek: " + kierunek);
        }

}
