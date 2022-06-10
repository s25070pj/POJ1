package ex2;

public class MovablePoint implements Movable{
    int x;
    int y;

    MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }





    @Override
    public void moveDown() {
        this.x--;

    }

    @Override
    public void moveUp() {
        this.x++;
    }

    @Override
    public void moveLeft() {
        this.y--;
    }

    @Override
    public void moveRight() {
        this.y++;
    }
}
