package com.company;


public class zadanie9 {

    public static void main(String[] args) throws java.io.IOException {

        char letter;
        char answer = 'N';

        System.out.println("Pomyślałem literę z przedzialu od A do Z");

        System.out.print("Odgadnij ją: ");

        letter = (char) System.in.read();

        if (letter==answer){
            System.out.println("Dobrze!");
        }
        if (letter<answer){
            System.out.println("Źle! liczba za mała");
        }
        if (letter>answer) {
            System.out.println("Źle! liczba za duza");
        }




    }
}
