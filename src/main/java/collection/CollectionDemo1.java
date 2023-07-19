package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合
 * <p>java.util.Collection接口，该接口是所有集合的顶级接口，定义了所有集合都具备的功能
 * <p></p>集合与数组一样可以保存一组元素，并且操作元素的行为都被分装为了方法，使用便捷
 * <p>集合有多种不同的数据结构，选择更多
 * <p></p>Collection
 *
 * @author Beeeee
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
//        String[] array = new String[2];
//        array[0] = "xxxxx";

        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
    }
}
