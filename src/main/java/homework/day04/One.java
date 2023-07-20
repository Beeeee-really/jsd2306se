package homework.day04;

import java.util.ArrayList;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 20; i += 1) {
            list.add((int) (Math.random() * 100));
        }

    }
}
