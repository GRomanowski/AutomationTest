import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
HashMap Obiektów
*/

public class Solution16 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> mapa = new HashMap<String, Object>();
        mapa.put("Sim", 5);
        mapa.put("Tom", 5.5);
        mapa.put("Arbus", false);
        mapa.put("Dzieciak", null);
        mapa.put("Kot", "Kot");
        mapa.put("Je", new Long(56));
        mapa.put("Jedzonko", new Character('3'));
        mapa.put("Gevey", '6');
        mapa.put("Przytulas", 111111111111L);
        mapa.put("Comp", (double) 123);

        //tutaj wpisz swój kod

        Iterator<Map.Entry<String, Object>> iterator = mapa.entrySet().iterator();


        while (iterator.hasNext()) {
            // Sprawdza wartość
            Map.Entry<String, Object> para = iterator.next();

            Object wartosc =  para.getValue();        // Wartość
            String Klucz = para.getKey();        // Klucz
            System.out.println(Klucz + "-" + wartosc);
        }
    }
}

