package Task3;

public class MovablePoint extends Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    };

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    void moveDOWN() {
        super.moveDOWN();
    };

    @Override
    void moveLeft() {
        super.moveLeft();
    }

    @Override
    void moveRight() {
        super.moveRight();
    }

    @Override
    void moveUP() {
        super.moveUP();
    }
}
