public class Circle {
    private double radius;
    private String color;
    private double area;

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    Circle(String color){
        this.radius = 10.0;
        this.color = color;
    }
    Circle(){
        this.radius = 5.0;
        this.color = "blue";
    }

    public String toString(){
     return "The circle c4 has radius "+ getRadius() +" and area of "+ getArea()+ " and color of "+ getColor();
    }

    public double getRadius(){
        return(this.radius);
    }
    public double getArea(){
        this.area = Math.PI*radius*radius;
        return(this.area);
    }
    public String getColor(){
        return(this.color);
    }

    public void setRadius(double radiusParameter){
        this.radius = radiusParameter;
    }
    public void setColor(String colorParameter){
         this.color = colorParameter;
    }

}
