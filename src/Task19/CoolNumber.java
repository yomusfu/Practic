package Task19;

import java.lang.String;

public class CoolNumber {

    char x,y,z;

    double n,r;

    public CoolNumber() {
        this.n = 0;
        this.r = 0;
    }

    public CoolNumber(char x, char y, char z, double n, double r) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.n = n;
        this.r = r;
    }

    @Override
    public String toString() {
        return "CoolNumber{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", n=" + n +
                ", r=" + r +
                '}';
    }

    public String Generator(){

        String Nomer="";

        n=(Math.random()*((9-0)+1))+0;
        r=(Math.random()*((199-1)+1))+1;
        char[] OptionChar ={'A','B','E','K','M','H','O','P','C','T','Y','X'};
        x=OptionChar[(int)(Math.random()*((12-0)+1))+0];
        y=OptionChar[(int)(Math.random()*((12-0)+1))+0];
        z=OptionChar[(int)(Math.random()*((12-0)+1))+0];
        Nomer=x+Integer.toString((int)(n))+Integer.toString((int)(n))+Integer.toString((int)(n))+y+z+Integer.toString((int)(r));
        return Nomer;
    }

    public void OutPut (char x, char y, char z, double n, double r){

        System.out.print(x);
        System.out.print(n);
        System.out.print(n);
        System.out.print(n);
        System.out.print(y);
        System.out.print(z);
        System.out.print(r);
    }
}
