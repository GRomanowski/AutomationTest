import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String word = scanner.nextLine();
            list.add(word);

        }
        String minEl = list.get(0);

        for (int i = 1; i < 4; i++) {
            if (list.get(i).length() >= minEl.length() ) {
                minEl = list.get(i);
            } else {
                System.out.println(i);
                break;
            }


        }
    }
}
