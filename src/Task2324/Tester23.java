package Task2324;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Tester23 {
    public static void main(String[] args) throws IOException {
        Parser csv = new Parser();
        List<String> lines = Files.readAllLines
                (Paths.get("src/Task2324/movementList.csv"));
        for (int i = 1; i < lines.size(); i++) {
            csv.CalculateData(lines.get(i));
        }
        csv.printCSV();
    }
}
