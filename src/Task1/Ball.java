package Task1;
import java.lang.*;
public class Ball
{
    private String type;
    private String color;
    public Ball(String T, String C){
        type=T;
        color=C;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setType(String type) {
        type = type;
    }

    public void setColor(String color) {
        color = color;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    void Out() {
        System.out.println("Ball's type is "+type+" and color is "+color);
    }

    public static void main (String[] args) {

        Ball b1 = new Ball ("BasketBall","Red");

        Ball b2 = new Ball ("Football","");

        Ball b3 = new Ball ("","White");

        b2.setColor("Yellow");

        b3.setType("Voleyball");

        b1.Out();

        b2.Out();

        b3.Out();
    }
};


