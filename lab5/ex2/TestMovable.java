package ex2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1,1);
        point.moveDown();
        System.out.println(point.toString());
        point.moveLeft();
        System.out.println(point.toString());
        point.moveLeft();
        System.out.println(point.toString());
        point.moveLeft();
        System.out.println(point.toString());
        point.moveLeft();
        System.out.println(point.toString());
        point.moveDown();
        System.out.println(point.toString());
        point.moveDown();
        System.out.println(point.toString());
    }
}
