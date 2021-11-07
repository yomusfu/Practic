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

    public static void main(String[] args) {
        //ex2
        System.out.println(isThatStr("abcdefghijklmnopqrstuv18340"));
        System.out.println(isThatStr("asdzfghd4yt5y5"));
        System.out.println();
        //ex3
        System.out.println(findRubEurUsd("12.3 RUB, fejhge12 EUdsfrg3.789USD"));
        System.out.println();
    }
}
