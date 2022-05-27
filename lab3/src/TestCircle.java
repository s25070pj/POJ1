public class TestCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle(7.0, "red");
        System.out.println(c1.toString());

        Circle c2 = new Circle("pink");
        System.out.println(c2.toString());

        Circle c3 = new Circle();
        System.out.println(c3.toString());

        Circle c4 = new Circle();
        c4.setRadius(12.0);
        c4.setColor("green");
        System.out.println(c4.toString());

    }


}
