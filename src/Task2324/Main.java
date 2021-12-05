package Task2324;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CSVParser csv = new CSVParser();
        List<String> lines = Files.readAllLines
                (Paths.get("src/Task2324/movementList.csv"));
        for (int i = 1; i < lines.size(); i++) {
            csv.CalculateData(lines.get(i));
        }
        csv.printCSV();
    }
}