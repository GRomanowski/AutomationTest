import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
W kolejności malejącej
*/

public class Solution10 {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] tablica = new int[20];
            for (int i = 0; i < 20; i++) {
                tablica[i] = Integer.parseInt(reader.readLine());
            }

            sortuj(tablica);

            for (int x : tablica) {
                System.out.println(x);
            }
        }

        public static void sortuj(int[] tablica) {
            for (int i = 0; i < tablica.length; i++) {
                for (int j = i; j < tablica.length; j++) {
                    if (tablica[i] < tablica[j]) {
                        int temp = tablica[i];
                        tablica[i] = tablica[j];
                        tablica[j] = temp;
                    }
                }
            }
        }
    }