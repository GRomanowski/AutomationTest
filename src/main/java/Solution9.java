import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Zmiana funkcjonalności
*/

public class Solution9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            lista.add(s);
        }

        for (int i = 0; i < lista.size(); i++) {
            String s = lista.get(i);
            if (s.length() % 2 == 0) {
                System.out.print(s + " ");
                System.out.print(s + " \n");

            } else {
                System.out.print(s + " ");
                System.out.print(s + " ");
                System.out.print(s + " \n");
            }
        }
    }
}