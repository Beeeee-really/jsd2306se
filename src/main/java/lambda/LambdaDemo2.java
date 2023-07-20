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
        /*
                    V
           如果lambda表达式中只有一个参数时，"()"可以不写
         */
        c.forEach(consumer);
        c.forEach((o) -> System.out.println(o));
        /*
            如果lambda表达式中使用的参数与方法体中代码调用的方法参数一致时，可以使用方法引用写法

             c.forEach((o) -> System.out.println(o));
             lambada参数          方法体中调用方法时传入的参数
                        可以使用方法引用的写法
                        System.out::println



         */
        c.forEach(System.out::println);


    }
}
