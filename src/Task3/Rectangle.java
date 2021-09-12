package Task3;
import java.lang.*;
public class Rectangle extends Shape{

    protected double width;

    protected  double length;

    @Override
    double getArea() {
        if(filled=true)
            return width*length;
        else
            return 0;
    }

    @Override
    double getPerimeter() {
        return 2*width+2*length;
    }
    Rectangle(){
        this.length=0;
        this.width=0;
    }
    Rectangle(double width,double length){
        this.width=1;
        this.length=1;
        this.color="red";
        this.filled=false;
    };
    Rectangle(double width,double length,String color,boolean filled){
        this.width=width;
        this.color=color;
        this.filled=filled;
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public static void main(String args[]){

        Shape s2 = new Rectangle(1.0,2.0,"RED",false);
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getColor());

        Rectangle r1=(Rectangle) s2;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
    }
}
