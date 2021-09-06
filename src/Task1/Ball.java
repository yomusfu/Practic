package Task1;
import java.lang.*;
public class Ball
{
    private String Type;
    private String Color;
    public Ball(String T, String C){
        Type=T;
        Color=C;
    }
    public void SetType (String T)
    {
        this.Type=T;
    }
    public void SetColor(String C)
    {
        this.Color=C;
    }
    public void GetType(String Type)
    {
        this.Type=Type;
    }
    String ToString()
    {
        return "Ball for "+ this.Type+" and color is "+ this.Color;
    }
    void Out()
    {
        System.out.println("Ball's type is "+Type+" and color is "+Color);
    }
    public static void main (String[] args)
    {
        Ball b1 = new Ball ("BasketBall","Red");
        Ball b2 = new Ball ("Football","");
        Ball b3 = new Ball ("","White");
        b2.SetColor("Yellow");
        b3.SetType("Voleyball");
        b1.Out();
        b2.Out();
        b3.Out();
    }
};


