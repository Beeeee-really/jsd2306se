package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历                    die
 * 集合提供了统一的遍历集合元素的方式:迭代器模式
 * <p>
 * Collection提供了方法:
 * Iterator iterator()
 * 该方法用于返回遍历当前集合的迭代器
 * <p>
 * java.util.Iterator接口，迭代器接口，定义了遍历集合的通用操作。
 * 所有的集合都提供了一个用于遍历自身元素的迭代器实现类。
 * <p>
 * 使用迭代器遍历集合遵循的步骤为:问->取->删
 * 其中删除元素不是遍历过程中的必须操作
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
//        Collection c = new HashSet();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
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
        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);
            if ("#".equals(str)){//先特定内容再变量，防止出现null值报错
                /*
                    迭代器遍历过程中不可以
                 */
                c.remove(str);
            }
        }

        System.out.println(c);
    }
}