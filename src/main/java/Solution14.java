import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution14 {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> mapa = new HashMap<String, String>();
        mapa.put("Sim", "Sim");
        mapa.put("Tom", "Tom");
        mapa.put("Arbus", "Arbus");
        mapa.put("Dzieciak", "Dzieciak");
        mapa.put("Kot", "Kot");
        mapa.put("Pies", "Pies");
        mapa.put("Je", "Je");
        mapa.put("Jedzonko", "Jedzonko");
        mapa.put("Gevey", "Gevey");
        mapa.put("Przytulas", "Przytulas");

        printKlucze(mapa);
    }

    public static void printKlucze(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            // Sprawdza parę klucz
            Map.Entry<String, String> para = iterator.next();
            String klucz = para.getKey();            // Klucz

            System.out.println(klucz);
        }
    }
}
