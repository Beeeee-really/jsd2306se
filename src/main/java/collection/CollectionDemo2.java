package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合中与元素的toString和equals方法相关的操作
 * <p>
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

        Point p = new Point(1, 2);
        /*
            boolean contains(Object o)
            判断当前集合是否包含给定元素o，如果包含返回true，否则返回false
            注意：
            判断当前集合是否包含的依据是给定元素是否与集合现有元素存在equals比较为true的情况，存在，则认为包含
            需重写equals
         */
        boolean contains = c.contains(p);
        System.out.println("是否包含:" + contains);
    }
}
