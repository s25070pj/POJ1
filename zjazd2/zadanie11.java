package com.company;

 class Vehicle1 {
    int passengers;
    int fuelcap;
    int lmk;

     Vehicle1(int passengers, int fuelcap, int lmk) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.lmk = lmk;
    }
}

class VehicleProg1 {

    public static void main(String[] args) {

        Vehicle1 SportsCar = new Vehicle1(5, 55, 13);
        Vehicle1 MiniVan = new Vehicle1(7, 80, 9);

        System.out.println("Minivan przewozi " + MiniVan.passengers + " osób na odległość do " + MiniVan.fuelcap / MiniVan.lmk * 100 + " kilometrow");
        System.out.println("SportsCar przewozi " + SportsCar.passengers + " osób na odległość do " + SportsCar.fuelcap / SportsCar.lmk * 100 + " kilometrow");


    }
}