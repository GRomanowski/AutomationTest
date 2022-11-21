import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution8 {
    public final static ArrayList<Kot> KOTY = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String imie = reader.readLine();

            if (imie.isEmpty()) {
                break;
            }

            Kot kot = new Kot(imie);
            KOTY.add(kot);
        }

        printLista();
    }

    public static void printLista() {
        for (Kot kot : KOTY) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;
        private int wiek;
        private int waga;
        private int dlugoscOgona;

        Kot(String imie, int wiek, int waga, int dlugoscOgona) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.dlugoscOgona = dlugoscOgona;
        }

        public Kot(String imie) {
            this.imie = imie;
        }

        @Override
        public String toString() {
            return "Imię kota: " + imie + ", wiek: " + wiek + ", waga: " + waga + ", ogon: " + dlugoscOgona;
        }
    }
}