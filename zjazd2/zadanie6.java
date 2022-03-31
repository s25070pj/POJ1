package com.company;

public class zadanie6 {
    public static void main(String[] args) {

        int[][] FirstTable = new int[3][3];
        int[] TempTable;

        for(int i=0; i < 3; i++){
           String s = "";
            for (int j = 0; j < 3; j++){
                FirstTable[i][j] = i + 10 * j;
               s = s + " " + FirstTable[i][j];
            }
          System.out.println(s);
        }
       System.out.println();

        TempTable = FirstTable[0];
        FirstTable[0] = FirstTable[1];
        FirstTable[1] = TempTable;


        for(int i=0; i < 3; i++){
            String s = "";
            for (int j = 0; j < 3; j++){
                FirstTable[i][j] = i + 10 * j;
                s = s + " " + FirstTable[i][j];
            }
            System.out.println(s);
        }

    }


}
