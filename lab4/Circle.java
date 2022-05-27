

public class Circle {
    public double radius = 1.0;
    public String color = "blue";
    public double area = this.radius*this.radius*Math.PI;

    public Circle(){

    }
    public Circle(double Radius){
        this.radius = Radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radiusParameter){
        this.radius = radiusParameter;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public String toString(){
        return "The radius of the circle is: "+ getRadius() +",  the area is: "+ getArea();
    }





}
