package com.company;

class Vehicle2 {
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

    void range(){
         System.out.println(" Zasięg pojazdu wynosi: " + fuelcap/lmk*100 + " km");
    }


}


 class VehicleProg2 {

    public static void main(String[] args) {

        Vehicle2 SportsCar = new Vehicle2();
        Vehicle2 MiniVan = new Vehicle2();

        SportsCar.setPassengers(5);
        SportsCar.setFuelcap(55);
        SportsCar.setLmk(13);

        MiniVan.setPassengers(7);
        MiniVan.setFuelcap(80);
        MiniVan.setLmk(9);


        System.out.println("Minivan przewozi " + MiniVan.getPassengers());
        MiniVan.range();
        System.out.println("SportsCar przewozi " + SportsCar.getPassengers());
        SportsCar.range();


    }
}