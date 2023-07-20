package homework.day03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 10; i += 1) {
            list.add(i + 1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
