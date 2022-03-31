package com.company;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1, str2;

        System.out.println("podaj pierwszy wyraz");
        str1=scanner.nextLine();

        System.out.println("podaj drugi wyraz");
        str2=scanner.nextLine();

        System.out.println(str1.equals(str2));


    }


}