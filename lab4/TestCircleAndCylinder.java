

public class TestCircleAndCylinder {
    public static void main(String[] args) {

        Cylinder cyl = new Cylinder();
        cyl.setRadius(22.0);
        cyl.setHeight(5.0);
        System.out.println(cyl.toString());


        Cylinder cyl2 = new Cylinder(1.0);
        System.out.println(cyl2.toString());


        Cylinder cyl3 = new Cylinder(33.0,15.0);
        System.out.println(cyl3.toString());




    }
}
