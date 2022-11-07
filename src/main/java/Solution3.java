import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();


        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tekst = scan.nextLine();
            lista.add(tekst);
        }

        for (int i = 0; i < m; i++) {
            lista.add(lista.remove(0));
        }

        for (String s : lista) {
            System.out.println(s);
        }
    }
}

