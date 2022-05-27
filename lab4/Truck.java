public class Truck extends Car implements Purchase{
    public int weight;

    public Truck(int speed, double regularPrice, String color, int weight){
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight(){
        return this.weight;
    }

    public double getSalePrice(){
        if (weight>2000){
            return super.getSalePrice()*0.9;
        }else{
            return super.getSalePrice();
        }
    }

    public String toString(){
        return "The name of car is: "+ getPurchaseInfo() +",  the speed is: "+ super.getSpeed() +", the regularPrice is: "+ getSalePrice() +" the color is: "+ super.getColor()+ " and the weight is: "+ getWeight();
    }

    @Override
    public String getPurchaseInfo() {
        return "Truck";
    }
}
