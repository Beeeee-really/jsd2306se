package homework.day03;

import java.util.ArrayList;
import java.util.List;

public class Four {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i += 1) {
            list.add((int) (Math.random() * 100));

        }
        System.out.println(list);

        List<Integer> subList = list.subList(3, 7);
        for (int i = 0; i < subList.size() / 2; i += 1) {
            subList.set(i, subList.set(subList.size() - i - 1, subList.get(i)));
        }
        System.out.println(subList);
    }
}
