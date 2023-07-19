package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合的遍历
 * <p>集合提供了统一的遍历集合元素的方式:迭代器模式
 * <p></p>Collection提供了方法:
 * <p>该方法用于返回遍历当前集合的迭代器
 * <p></p>java.util.Iterator接口，迭代器接口
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
    }
}
