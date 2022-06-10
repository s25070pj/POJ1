package ex1;

import java.util.ArrayList;

public class e1 {
    public static void main(String[] args) {
        long millisActualTime = System.currentTimeMillis();


        ArrayList a1 = new ArrayList();

        for( int i=2; i<=100; i=i+2){
            a1.add(i);

        }

        for (int i = 0; i<50; i++){
            System.out.println(i +": "+ a1.get(i));
        }
        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println(executionTime+ "ms");
    }
}
