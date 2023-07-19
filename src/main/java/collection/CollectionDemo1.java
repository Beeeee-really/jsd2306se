package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合
 * <p>java.util.Collection接口，该接口是所有集合的顶级接口，定义了所有集合都具备的功能
 * <p></p>集合与数组一样可以保存一组元素，并且操作元素的行为都被分装为了方法，使用便捷
 * <p>集合有多种不同的数据结构，选择更多
 * <p></p>Collection下面又有很多不同的分支
 * <p>java.util.List:线性表，特点:可以存放重复元素且有序
 * <p>java.util.Set:不可以存放重复元素，大部分实现是无序的
 * <p>
 *
 * @author Beeeee
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
//        String[] array = new String[2];
//        array[0] = "xxxxx";

        Collection a = new HashSet();
        /*
            bollean add(E e)
            向集合中添加一个元素，元素添加成功后返回true
         */
        a.add("one");
        a.add("two");
        a.add("three");
        a.add("four");
        a.add("five");
        a.add("one");
        System.out.println(a);

        Collection b = new ArrayList();
        b.add("qwq");
        b.add("awa");
        b.add(":)");
        b.add(":(");
        b.add("^_^");
        b.add("qwq");//重复元素可以放入list集合，但不能放入set集合
        System.out.println(b);




        /*
            int size()
            返回当前集合元素的个数
         */
        int size = b.size();
        System.out.println("size:" + size);




        /*
            boolean isEmpty()
            判断当前集合是否为空集(不包含任何元素,size=0)
         */
        boolean isEmpty = b.isEmpty();
        System.out.println("是否是空集:" + isEmpty);
        



        /*
            void clear()
            清空集合
         */
        b.clear();
        System.out.println(b);
        System.out.println("size:" + b.size());
        System.out.println("是否是空集:" + b.isEmpty());
    }
}
