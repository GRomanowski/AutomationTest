import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Czas na 10000 wstawień
*/

public class Solution20 {
    public static void main(String[] args) {
        System.out.println(getCzasWstawienWms(new ArrayList()));
        System.out.println(getCzasWstawienWms(new LinkedList()));
    }

    public static long getCzasWstawienWms(List lista) {
        // tutaj wpisz swój kod
        Date date1 = new Date();
        wstaw10000(lista);
        Date date2 = new Date();
        return date2.getTime() - date1.getTime();

        // tutaj wpisz swój kod

    }

    public static void wstaw10000(List lista) {
        for (int i = 0; i < 10000; i++) {
            lista.add(0, new Object());
        }
    }
}