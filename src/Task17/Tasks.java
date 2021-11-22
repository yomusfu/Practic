package Task17;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {
    public static boolean isThatStr(String s){
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static ArrayList<String> findRubEurUsd(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }
    public static boolean isThatMac(String s){
        boolean f=false;
        Pattern p1= Pattern.compile("([a-f]+[A-F]){3}+([0-9]{2}+:){2}+[0-9]{2}");
        Matcher m1= p1.matcher(s);
        boolean b=m1.matches();
        return b;
    }
    public static void main(String[] args) {
        //ex1
        System.out.println(isThatStr("abcdefghijklmnopqrstuv18340."));
        System.out.println(isThatStr("abcdefghijklmnoasdfasdpqrstuv18340."));
        //ex2
        System.out.println(isThatMac("aE:dC:cA:56:76:54."));
        System.out.println(isThatMac("01:23:45:67:89:Az."));
        System.out.println();
        //ex3
        System.out.println(findRubEurUsd("12.3 RUB, fejhge12 EUdsfrg3.789USD"));
        System.out.println();
    }
}
