package com.company;
import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {

        int x, y, m, n, o;
        float w, z;


        Scanner scanner = new Scanner(System.in);
        Scanner scannerFloat = new Scanner(System.in);
        System.out.println("Podaj x");
        x = scanner.nextInt();

        System.out.println("Podaj y");
        y = scanner.nextInt();

        System.out.println("Podaj w");
        w = scannerFloat.nextFloat();

        System.out.println("Podaj z");
        z = scannerFloat.nextFloat();

        System.out.println("Podaj m");
        m = scanner.nextInt();

        System.out.println("Podaj n");
        n = scanner.nextInt();

        System.out.println("Podaj o");
        o = scanner.nextInt();


        System.out.println("\n\nx = "+ x);
        System.out.println("y = "+ y);
        System.out.println("+xx = " + (++x));
        System.out.println("y++ = " + (y++));
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);

        System.out.println("\n\nw = "+ w);
        System.out.println("z = " + z);
        System.out.println("w + z = " +(w+z));
        System.out.println("w - z = " +(w-z));
        System.out.println("w * z = " +(w*z));
        System.out.println("w / z = " +(w/z));
        System.out.println("w % z = " +(w%z));

        System.out.println("\n\nm = "+m);
        System.out.println("n = "+n);
        System.out.println("o = "+o);


        System.out.println("\nm < n = "+ (m<n));
        System.out.println("m > o = "+ (m>o));
        System.out.println("n <= o = "+ (m<=o));
        System.out.println("m >= n = "+ (m>=n));
        System.out.println("n == o = "+ (n==o));
        System.out.println("m != o = "+ (m!=o));




    }

}
