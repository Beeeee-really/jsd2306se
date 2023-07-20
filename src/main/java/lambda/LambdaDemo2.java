package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * JDK8后集合提供了一个基于表达式的遍历方法farEach
 * <p>
 *
 * @author Beeeee
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };

        c.forEach(consumer);
    }
}
