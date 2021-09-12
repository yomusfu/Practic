package Task3;
import java.lang.*;
public class Square extends Rectangle{
    protected double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    Square(){
        this.side=1;
        this.color="yellow";
        this.filled=false;
    }
    Square(double side){
        this.side=side;
        this.color="yellow";
        this.filled=false;
    }
    Square(double side,String color,boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    public static void main(String args[])
    {
        Shape s3 = new Square(6.6);
        System.out.println(s3);
        System.out.println(s3.getArea());

        Rectangle r2= (Square)s3;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

        Square sq1= (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getLength());
        System.out.println(sq1.getSide());
    }
}

