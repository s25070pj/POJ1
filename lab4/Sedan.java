public class Sedan extends Car implements Purchase{
    public int lenght = 21;

    public Sedan(){

    }

     public Sedan(int speed, double regularPrice, String color, int lenght){
        super(speed, regularPrice, color);
        this.lenght = lenght;

        
    }

    public int getLenght(){
        return this.lenght;
    }


    public double getSalePrice() {
        if (getLenght() > 20) {
            return super.getSalePrice() * 0.95;
        } else
            return super.getSalePrice() * 0.9;
    }

    public String toString(){
        return "The name of car is: "+ getPurchaseInfo() +",  the speed is: "+ super.getSpeed() +", the regularPrice is: "+ getSalePrice() +", the color is: "+ super.getColor() +" and the lenght is: "+ getLenght();
    }

    @Override
    public String getPurchaseInfo() {
        return "Sedan";
    }
}

