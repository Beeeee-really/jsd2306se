package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合中与元素的toString和equals方法相关的操作
 * <p>
 *
 * @author Beeeee
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        /*
            集合在判断是否为重复元素时，也是依靠equals方法的比较
            Set集合不能存入equals比较为true的元素两次
         */
//        Collection c = new ArrayList();
        Collection c = new HashSet();
        c.add(new Point(1, 2));
        c.add(new Point(3, 4));
        c.add(new Point(5, 6));
        c.add(new Point(7, 8));
        c.add(new Point(9, 10));
        c.add(new Point(1, 2));
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

        /*
            boolean remove(Object o)
            从集合中删除给定元素o
            删除逻辑：
            删除集合中与给定元素o equals方法比较为true的元素
         */
        c.remove(p);
        System.out.println(c);
    }
}
