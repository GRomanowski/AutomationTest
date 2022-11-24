import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution11 {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<>();
        set.add("arbuz");
        set.add("banan");
        set.add("wiśnia");
        set.add("gruszka");
        set.add("jeżyna");
        set.add("żeńszeń");
        set.add("truskawka");
        set.add("irys");
        set.add("ziemniak");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }
    }
}

