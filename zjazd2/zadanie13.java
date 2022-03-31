package com.company;

class Vehicle3 {
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


}


class VehicleProg3 {

    public static void main(String[] args) {

        Vehicle3 SportsCar = new Vehicle3();
        Vehicle3 MiniVan = new Vehicle3();

        SportsCar.setPassengers(5);
        SportsCar.setFuelcap(55);
        SportsCar.setLmk(13);

        MiniVan.setPassengers(7);
        MiniVan.setFuelcap(80);
        MiniVan.setLmk(9);


        System.out.println("Minivan przewozi " + MiniVan.getPassengers() + " na odległość " + MiniVan.range() + " km ");

        System.out.println("SportsCar przewozi " + SportsCar.getPassengers() + " na odległość " + SportsCar.range() + " km ");



    }
}