import com.beust.ah.A;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(scan.nextInt());
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(list.get(9-i));
            }
        }
    }