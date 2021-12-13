package Task2930;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.io.BufferedReader;

public class Tester {
    public static void main(String[] args) throws IOException {
        Comparator<Map.Entry<String, Integer>> c1 = Map.Entry.comparingByValue(Comparator.reverseOrder());
        Comparator<Map.Entry<String, Integer>> c2 = Map.Entry.comparingByKey();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine().toLowerCase().replaceAll("[!,.]", "");
        String[] words = str.split("[ \\-]");

        Arrays.stream(words)
                .map(String::toLowerCase) // убираем регистры
                .collect(Collectors.groupingBy(x -> x, Collectors.summingInt(p -> 1))) // сгруппировывает элементы тому как часто они встречаются
                .entrySet() // stream из map
                .stream()
                .sorted(c1.thenComparing(c2))
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
    }
}