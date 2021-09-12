package Task3;

public class Circle extends Shape{

    protected double radius;

    Circle(){

        this.filled=false;

        this.radius=1;

        this.color="blue";

    };
    Circle(double radius){

        this.filled=false;

        this.color="blue";

        this.radius=radius;

    };
    Circle(double radius,String color,boolean filled){

        this.radius=radius;

        this.color=color;

        this.filled=filled;

    };
    @Override
    double getArea() {

        if (filled==true)

        return Math.PI*Math.pow(radius,2);

        else return 0;
    }

    @Override
    double getPerimeter() {

        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {

        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }
    public static void main(String args[]){

        Shape s1 = new Circle(5.5,"RED",false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        Circle c1=(Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
    }
}
