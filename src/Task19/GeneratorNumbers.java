package Task19;

import java.util.*;


public class GeneratorNumbers extends CoolNumber {
   static String[] ArrayOfNumbers;

    public static void main(String[] args) {

        int i;

        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        ArrayOfNumbers= new String[20];
        for(i=1;i<=n;i++){
            ArrayOfNumbers[i]=Generator();
        }
        Arrays.sort(ArrayOfNumbers, (o1, o2) -> 0);

        String el=ArrayOfNumbers[(int) (Math.random() * ((n - 1) + 1))];

        ArrayList<String> inlist= new ArrayList<>(Arrays.asList(ArrayOfNumbers));

        HashSet<String> h= new HashSet<>(inlist);

        long m1 = System.currentTimeMillis();
        System.out.println(inlist.contains(el));
        System.out.println((double)(System.currentTimeMillis()-m1) );


        Set<String> sortedSet= new TreeSet<String>(new Comparator<String>(){
            public int compare(String o1,String o2){
                return o1.compareTo(o2);
            }
        });
        sortedSet.addAll(inlist);
        long m2 = System.currentTimeMillis();
        System.out.println(binarySearch(sortedSet,el));
        System.out.println((double)(System.currentTimeMillis()-m2));

        long m3 = System.currentTimeMillis();
        System.out.println(h.contains(el));
        System.out.println((double)(System.currentTimeMillis()-m3));

        long m4 = System.currentTimeMillis();
        TreeSet<String> H;
        H = new TreeSet<>(inlist);
        System.out.println(H.contains(el));
        System.out.println((double)(System.currentTimeMillis()-m4));
    }


}

