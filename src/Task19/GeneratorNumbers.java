package Task19;

import jdk.incubator.foreign.LibraryLookup;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;


public class GeneratorNumbers extends CoolNumber {
    String[] ArrayOfNumbers;

    public int main(String args[]) {

        int i;




        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        for(i=0;i<n;i++){
            ArrayOfNumbers[i]=Generator();
        }

        String el=ArrayOfNumbers[(int)(Math.random()*((n-0)+1))+0];

        List intlist = new ArrayList<String>(Arrays.asList(ArrayOfNumbers));

        HashSet<String> h= new HashSet<String>(intlist);

        TreeSet<String> H= new TreeSet<String>(intlist);

        long m1 = System.currentTimeMillis();
        System.out.println(intlist.contains(el));
        System.out.println((double)(System.currentTimeMillis()-m1) );

        long m2 = System.currentTimeMillis();
        System.out.println(Collections.binarySearch(intlist,el));
        System.out.println((double)(System.currentTimeMillis()-m2));

        long m3 = System.currentTimeMillis();
        System.out.println(h.contains(el));
        System.out.println((double)(System.currentTimeMillis()-m3));

        long m4 = System.currentTimeMillis();
        System.out.println(H.contains(el));
        System.out.println((double)(System.currentTimeMillis()-m4));

        return 0;
    }
}

