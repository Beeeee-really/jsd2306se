package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合中与元素的toString和equals方法相关的操作
 *
 * @author Beeeee
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1, 2));
        c.add(new Point(3, 4));
        c.add(new Point(5, 6));
        c.add(new Point(7, 8));
        c.add(new Point(9, 10));
        /*
            集合重写了·toString方法，格式：
            [1,2,3,5,7,8]
         */
        System.out.println(c);
    }
}
