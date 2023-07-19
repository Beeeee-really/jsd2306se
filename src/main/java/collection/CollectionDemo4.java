package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo4 {
    public static void main(String[] args) {


        Collection c1 = new HashSet();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1:" + c1);

        Collection c2 = new ArrayList();
        c2.add("andrid");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2:" + c2);
        c1.addAll(c2);
        System.out.println("c1:" + c1);
        System.out.println("c2" + c2);

        Collection c3 = new ArrayList();
        c3.add("ios");
        c3.add("c+=");
        System.out.println("c3" + c3);
        /*
            boolean containsAll(Collection c)
            判断当前集合是否包含给定元素集合中的所有元素


         */
        boolean contains = c1.containsAll(c3);
        System.out.println("c1包含c3的所有元素：" + contains);



         /*
            boolean retainAll(Collection c)
            仅保留当前集合中与给定集合的共有元素(取交集)
         */
//        c1.retainAll(c3);
//        System.out.println("c1:"+c1);

        /*
            boolean removeAll(Collection c)
            删除当前集合中与给定集合的共有元素
         */
        c1.removeAll(c3);
        System.out.println("c1:"+c1);


    }
}
