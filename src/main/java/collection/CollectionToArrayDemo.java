package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

//        Object[] array = c.toArray();
//        数组length>集合size时，将集合元素存入数组前几个位置上
//        String[] array = c.toArray(new String[c.size()]
//        数组length<集合size时，内部会创建与集合size等长的并于给定参数数组类型一至的数组，然后将元素存入数组返回
//        String[] array = c.toArray(new String[10]);
        String[] array = c.toArray(new String[1]);
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
    }
}
