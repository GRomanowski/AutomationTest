import java.util.HashMap;
import java.util.Map;

/* 
HashMap kotów
	Program nie powinien czytać wartości z klawiatury.
•	W metodzie dodajKotyDoMap() zadeklaruj zmienną HashMap z parami (String, Kot) i natychmiast ją zainicjalizuj.
•	Metoda dodajKotyDoMap() powinna dodawać wszystkie koty z tablicy String[] koty do kolekcji zgodnie z warunkami zadania.
•	Program powinien wyświetlać na ekranie zawartość kolekcji, każdą parę w nowej linii, z łącznikiem („-”) pomiędzy kluczem a wartością.
*/

public class Solution13 {
    public static void main(String[] args) throws Exception {
        String[] koty = new String[]{"Tygrysek", "Mania", "Odlot", "Marmolada", "Oskar", "Śnieżek", "Szefu", "Kafel", "Max", "Simba"};

        HashMap<String, Kot> mapa = dodajKotyDoMap(koty);

        for (Map.Entry<String, Kot> para : mapa.entrySet()) {
            System.out.println(para.getKey() + " - " + para.getValue());
        }
    }


    public static HashMap<String, Kot> dodajKotyDoMap(String[] koty) {
        HashMap<String, Kot> map = new HashMap<>();
//        for (String name : koty) {
//            map.put(name, new Kot(name));
//        }


        for (int i = 0; i < koty.length; i++) {
            map.put(koty[i],new Kot(koty[i]) );
        }
        return map;
    }

    public static class Kot {
        String imie;

        public Kot(String imie) {
            this.imie = imie;
        }

        @Override
        public String toString() {
            return imie != null ? imie.toUpperCase() : null;
        }
    }
}