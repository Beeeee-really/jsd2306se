package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * java.util.List集合
 * <p>List接口继承自Collection,特点：可以存放重复元素其有序
 * <p>List接口继承自Collection,特点:可以存放重复元素其有序
 * <p>List接口上定义了一套可以通过下标操作元素的方法
 * <p></p>常用实现类:
 * <p>java.util.ArrayList:内部使用数组实现,查询性能好,增删慢
 * <p>java.util.LinkedList:内部使用链表实现,增删性能好,查询慢
 * <p>在没有对性能十分苛刻要求的前提下,通常使用ArrayList即可
 * <p>
 *
 * @author Beeeee
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        /*
            E get(int index)
            获取当前集合中指定下标处对应的元素
         */
        //获取第三个元素
        String e = list.get(2);
        System.out.println(e);
        //可以使用普通的for循环遍历list集合
        for (int i = 0; i < e.length(); i += 1) {
            e = list.get(i);
            System.out.println(e);
        }

        /*
            E set(int index,E e)
            将给定元素设置到给定位置上，返回值为该位置被替换的元素
         */
        String old = list.set(2, "six");
        System.out.println(list);
        System.out.println(old);


        /*
            利用get,set方法完成集合的反准操作
         */

        list.set(2, "three");
        for (int i = 0; i < e.length() - 1; i += 1) {
            list.set(i, list.set(e.length() - i, list.get(i)));
        }
        System.out.println(list);
    }
}
