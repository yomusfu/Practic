package Task19;

import jdk.incubator.foreign.LibraryLookup;

import java.util.ArrayList.*;
import java.lang.Enum.*;
import java.util.HashSet.*;
import java.util.TreeSet.*;
import java.util.Scanner.*;

public class CoolNumber {
    Symbols x,y,z;
    double n,r;

    public CoolNumber() {
        this.n = 0;
        this.r = 0;
    }

    public CoolNumber(Symbols x, Symbols y, Symbols z, double n, double r) {
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

        Symbols[] symbolOption = Symbols.values();

        x=symbolOption[(int) (Math.random()*(((12-1)+1))+1)];
        y=symbolOption[(int) (Math.random()*(((12-1)+1))+1)];
        z=symbolOption[(int) (Math.random()*(((12-1)+1))+1)];

        return Nomer;
    }
    public void OutPut (Symbols x, Symbols y, Symbols z, double n, double r){


        System.out.print(n);
        System.out.print(n);
        System.out.print(n);


        System.out.print(r);
    }
}
