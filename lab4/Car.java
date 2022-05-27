public class Car {
    public int speed;
    public double regularPrice;
    public String color;

    public Car(){

    }
    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;

    }
    public int getSpeed(){
        return this.speed;
    }
    public String getColor(){
        return this.color;
    }
    public double getSalePrice(){
        return this.regularPrice;
    }

    public void setSpeed(int speedParameter){
        this.speed = speedParameter;
    }
    public void setColor(String colorParameter){
        this.color = colorParameter;
    }
    public void setRegularPrice(double regularPriceParameter){
        this.regularPrice = regularPriceParameter;
    }
}
