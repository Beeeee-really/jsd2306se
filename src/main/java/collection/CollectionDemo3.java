package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合只能存放引用元素，并且保存的是元素的引用(地址)
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
//        c.add(1);//触发编译器的自动装箱，被改为：c.add(Integer.valueOf(1));

        Point p = new Point(1, 2);
        c.add(p);
        System.out.println("p:" + p);
        System.out.println("c:" + c);


        p.setX(2);

        System.out.println("p:" + p);
        System.out.println("c:" + c);


    }
}
