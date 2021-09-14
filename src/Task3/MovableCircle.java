package Task3;

public class MovableCircle implements Movable{
    MovablePoint center;
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    int radius;
    MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void moveUP() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveDOWN() {

    }
}
