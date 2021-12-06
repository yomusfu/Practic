package Task2930;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.Collectors;

 public class Tester {
    public static void main(String[] args) throws IOException{

        //Сортировка
        Comparator<Map.Entry<String,Integer>> sortByKey = Map.Entry.comparingByKey();
        Comparator<Map.Entry<String,Integer>> sortByValue = Map.Entry.comparingByValue(Comparator.reverseOrder());
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //Привод к нижнему регистру и удаление знаков, оставление только букв
        String str = in.readLine().toLowerCase().replaceAll("[!,.]","");

        //Разделение строки на массив слов
        String[] words = str.split(" ");
        System.out.println(words[words.length-1]);

        //Собирание по признакам, перевод в поток и дальнейшая сортировка
        Arrays.stream(words).collect(Collectors.groupingBy(x->x,Collectors.summingInt(p->1))).entrySet().stream()
                .sorted(sortByKey.thenComparing(sortByValue))
                .sorted(sortByValue).limit(10).forEach(System.out::println);
    }
}
