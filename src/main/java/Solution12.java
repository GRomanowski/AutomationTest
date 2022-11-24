import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution12 {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("arbuz", "melon");
        map.put("banan", "owoc");
        map.put("wiśnia", "owoc");
        map.put("gruszka", "owoc");
        map.put("kantalupa", "melon");
        map.put("jeżyna", "owoc");
        map.put("żeńszeń", "korzeń");
        map.put("truskawka", "owoc");
        map.put("irys", "kwiat");
        map.put("ziemniak", "bulwa");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            // Sprawdza parę klucz-wartość
            Map.Entry<String, String> para = iterator.next();
            String klucz = para.getKey();            // Klucz
            String wartosc = para.getValue();        // Wartość
            System.out.println(klucz + ":" + wartosc);
        }
    }
}

