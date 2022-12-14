import java.util.ArrayList;
import java.util.LinkedList;

public class Solution17 {
    public static Object utworzArrayList() {
        ArrayList alist = new ArrayList();
        alist.add("a");
        alist.add("a");
        alist.add("a");
        alist.add("a");
        return alist;
    }

    public static Object utworzLinkedList() {
        LinkedList llist = new LinkedList();
        llist.add("b");
        llist.add("b");
        llist.add("b");
        return llist;

    }

    public static void main(String[] args) {
        System.out.println(utworzArrayList());
        System.out.println(utworzLinkedList());
    }
}
