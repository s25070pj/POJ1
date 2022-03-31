package com.company;
import java.util.Scanner;

class Vehicle5 {
    int passengers;
    int fuelcap;
    int lmk;

    void setPassengers(int passengersParameter){
        passengers = passengersParameter;
    }

    void setFuelcap(int fuelcapParameter){
        fuelcap = fuelcapParameter;
    }

    void setLmk(int lmkParameter){
        lmk = lmkParameter;
    }

    int getPassengers(){
        return passengers;
    }

    int getFuelcap(){
        return fuelcap;
    }

    int getLmk(){
        return lmk;
    }

    int range(){
        return fuelcap/lmk*100;
    }

    int rangeOnFullTank(int lengthOfRoad){
        return lengthOfRoad*lmk/100;
    }

}

class VehicleProg5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Trasę do ktora samochod ma przejechać");
        int lengthOfRoad = scanner.nextInt();

        Vehicle5 SportsCar = new Vehicle5();
        Vehicle5 MiniVan = new Vehicle5();

        SportsCar.setPassengers(5);
        SportsCar.setFuelcap(55);
        SportsCar.setLmk(13);

        MiniVan.setPassengers(7);
        MiniVan.setFuelcap(80);
        MiniVan.setLmk(9);

        System.out.println("Minivan potrzebuje " + MiniVan.rangeOnFullTank(lengthOfRoad) + " litrów paliwa aby przejechać " + lengthOfRoad + " km ");
        System.out.println("SportsCar potrzebuje " + SportsCar.rangeOnFullTank(lengthOfRoad) + " litrów paliwa aby przejechać " + lengthOfRoad + " km ");

    }
}