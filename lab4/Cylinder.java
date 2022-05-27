
public class Cylinder extends Circle{
    public double height = 4.0;
    public double volume = super.getArea()*height;

    public Cylinder(){
    }
    public Cylinder(double radius){
        super(radius);

    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }


    public double getHeight(){
        return this.height;
    }
    public void setHeight(double heightParameter){
        this.height = heightParameter;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }
    public String toString(){
        return "The radius of the circle is: "+ super.getRadius() +",  the area is: "+ super.getArea()+ ", the height is: "+ getHeight() +" and the volume is: "+ getVolume();
    }


}
