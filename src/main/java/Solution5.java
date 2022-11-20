import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> array = new ArrayList<>();
        String input;

        do {
            input = scan.nextLine();
            array.add(input);
        } while (!input.equals("koniec"));
        array.remove("koniec");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));

        }
    }
}