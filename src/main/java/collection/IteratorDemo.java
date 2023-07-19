package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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

        //通过集合获取遍历其元素的迭代器
        Iterator it = c.iterator();
        /*
            迭代器默认的起始位置实在集合第一个元素之前

            迭代器遍历集合的重要方法:
            boolean hasNext()
            通过迭代器判断集合是否还有元素可以遍历

            E next()
            让迭代器向后一个一个位置，并获取该位置上的元素

         */
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
            if("#".equals(str)){//好的书写习惯:字符串字面量.equals(字符串变量)
                /*
                    迭代器遍历过程中不可以通过集合的方法增删元素，否则抛出异常：
                    ConcurrentModificationException
                    并发       修改         异常
                 */
//                c.remove(str);
                /*
                    可以使用迭代器的remove方法从集合中删除本次通过next方法获取的元素
                    remove不可连续调用，再次调用remove需要先再次next获取下一个元素
                 */
                it.remove();
            }
        }

        System.out.println(c);
    }
}
