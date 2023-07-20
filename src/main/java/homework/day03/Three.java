package homework.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Three {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int i2 = 0;
        i2 = (int) (Math.random() * 100);
        System.out.println(i2);
        for (int i = 0; i < 9; i += 1) {
            i2 = (int) (Math.random() * 100);
            if ((list.containsAll(Collections.singleton(i2)))) {
                while ((list.containsAll(Collections.singleton(i2)))) {
                    i2 = (int) (Math.random() * 100);
                    System.out.println(i2);
                }
            } else {
                System.out.println(i2);

            }

        }
    }
}
