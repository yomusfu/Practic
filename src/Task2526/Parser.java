
package Task2526;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.*;
import org.jsoup.select.Elements;

public class Parser {
    public Parser() {
        Document document = null;
        try {
            document = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines")
                    .userAgent("Chrome/4.0.249.0")
                    .referrer("http://www.google.com")
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JsonObject result = new JsonObject(), station = new JsonObject();
        JsonArray lines = new JsonArray();
        result.add("stations", station);
        result.add("lines", lines);
        Elements stations = document.select("div.js-metro-stations");
        for (Element stat : stations) {
            JsonArray st = new JsonArray();
            for(Element el : stat.select("span.name")) st.add(el.text());
            station.add(stat.attr("data-line"), st);
        }
        Elements lnes = document.select("span.js-metro-line");
        for (Element line : lnes) {
            JsonObject el = new JsonObject();
            el.addProperty("number", line.attr("data-line"));
            el.addProperty("name", line.text());
            lines.add(el);
        }
        saveJSON(result.toString());
        openJSON();
    }

    public void saveJSON(String json) {
        try(FileWriter writer = new FileWriter("src/Task2526/map.json", false)) {
            writer.write(json);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openJSON() { //src/Practise25_26/map.json
        String json = "";
        try(FileReader reader = new FileReader("src/Task2526/map.json")) {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                json += (char)c;
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        JsonObject jsonObject = (new JsonParser()).parse(json).getAsJsonObject();
        JsonObject stations = (JsonObject) jsonObject.get("stations");
        System.out.println("Количество станций на каждой линии: ");
        for(String key : stations.keySet()) System.out.format("%s: %s\n",key, ((JsonArray)stations.get(key)).size());
    }
}