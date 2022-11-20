import java.io.IOException;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println(maxValueInArray(array) + " " + minValueInArray(array));
    }

    static int maxValueInArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    static int minValueInArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}
