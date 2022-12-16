import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
10 tysięcy usunięć i wstawień
*/

public class Solution18 {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        wstaw10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        usun10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        wstaw10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        usun10000(linkedList);
    }

    public static void wstaw10000(List lista) {
        for (int i = 0; i < 10000; i++) {
            lista.add(0, new Object());
        }
    }

    public static void get10000(List lista) {
        for (int i = 0; i < 10000; i++) {
            lista.get(5000);
        }
    }

    public static void set10000(List lista) {
        for (int i = 0; i < 10000; i++) {
            lista.set(5000, new Object());
        }
    }

    public static void usun10000(List lista) {
        for (int i = 0; i < 10000; i++) {
            if (lista.isEmpty()) {
                return;
            }
            lista.remove(0);
        }
    }
}