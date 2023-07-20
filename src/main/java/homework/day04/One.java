package homework.day04;

import java.util.*;

public class One {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 20; i += 1) {
            list.add((int) (Math.random() * 100));
        }
        Collections.sort(list);
        List subList = list.subList(6, 16);

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        Collections.sort(subList, c);
        System.out.println(subList);
    }
}
