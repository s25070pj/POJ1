package com.company;
import java.util.Scanner;
public class zadanie7 {

    public static void main(String[] args) {

        int radius, height;
        double volume;

        Scanner IntScanner = new Scanner(System.in);

        System.out.println("Podaj promień walca");
        radius = IntScanner.nextInt();

        System.out.println("Podaj wysokosc walca");
        height = IntScanner.nextInt();

        volume = 3.1416 * radius * radius * height;

        System.out.println("Pojemność walca wynosi" + volume);


    }


}
