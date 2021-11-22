package Task19;

import java.lang.String;

public class CoolNumber {

    static char x,y,z;

    static int n,r;

    public CoolNumber() {
        n = 0;
        r = 0;
    }

    public CoolNumber(char x, char y, char z, int n, int r) {
        CoolNumber.x = x;
        CoolNumber.y = y;
        CoolNumber.z = z;
        CoolNumber.n = n;
        CoolNumber.r = r;
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

    public static String Generator(){

        String Nomer=" ";

        n=(int)(Math.random()*((9)+1));
        r=(int)(Math.random()*((199-1)+1))+1;
        char[] OptionChar ={'A','B','E','K','M','H','O','P','C','T','Y','X'};
        x=OptionChar[(int)(Math.random()*((12-1)+1))];
        y=OptionChar[(int)(Math.random()*((12-1)+1))];
        z=OptionChar[(int)(Math.random()*((12-1)+1))];
        Nomer=x+Integer.toString(n)+y+z+Integer.toString(r);
        return Nomer;
    }

    public void OutPut (char x, char y, char z, int n, int r){

        System.out.print(x);
        System.out.print(n);
        System.out.print(n);
        System.out.print(n);
        System.out.print(y);
        System.out.print(z);
        System.out.print(r);
    }
}
