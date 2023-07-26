package thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        Loo loo = new Loo();
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    loo.addElement(i);
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    loo.addElement(i);
                }
            }
        };

        t1.start();
        t2.start();

    }
}

class Loo {
    private List<Integer> list = Collections.synchronizedList(new ArrayList<>());

    public void addElement(int num) {
        list.add(num);
    }
}
