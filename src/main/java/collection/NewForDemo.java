package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 语法：
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};
        for (int i = 0; i < array.length; i += 1) {
            String e = array[i];
            System.out.println(e);
        }

        /*
            新循环会在运行时变为循环
         */
        for (String e : array) {
            System.out.println(e);
        }


        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
//        c.add(123);//编译器认为这里add方法参数类型应当是String

        for (Object o : c) {
            String e = (String) o;
            System.out.println(e);
        }
/*
                public interface Iterator<E> {
                    boolean hasNext();
                    E next();
                }
                迭代器也支持泛型，指定时与其他遍历的集合
 */
        Iterator it = c.iterator();
        while (it.hasNext()) {
            String e = (String) it.next();
            System.out.println(e);

        }
    }
}
