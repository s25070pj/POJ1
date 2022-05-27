public class Ford extends Car implements Purchase{
    public int year;
    public int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public int getYear(){
        return this.year;
    }

    public int getManufacturerDiscount(){
        return this.manufacturerDiscount;
    }

    public double getSalePrice(){
        return super.getSalePrice()-getManufacturerDiscount();
    }

    public String toString(){
        return "The name of car is: "+ getPurchaseInfo() +",  the speed is: "+ super.getSpeed() +", the regularPrice is: "+ getSalePrice() +" the color is: "+ super.getColor()+ ", the year is: "+ getYear() +" and the manufacturerDiscount is: "+ getManufacturerDiscount();
    }

    @Override
    public String getPurchaseInfo() {
        return "Ford";
    }
}
