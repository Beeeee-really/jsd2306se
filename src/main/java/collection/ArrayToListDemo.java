package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为List集合
 * <p>数组的工具类java.util.Arrays提供了一个静态方法asList，可以将一个数组转换为List集合
 * <p> D
 *
 * @author Beeeee
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] arrays = {"one", "two", "three", "four", "five"};
        List<String> list = Arrays.asList(arrays);
        System.out.println(list.size());
        System.out.println("list:" + list);
        System.out.println(Arrays.toString(arrays));

        /*
            由于数组是定长的,因此该集合不能做增删等操作
            会抛出异常:UnsupportedOperationException
                        不支持         操作
         */

        list.set(1, "six");
        System.out.println("list:" + list);
        System.out.println(Arrays.toString(arrays));

//        list.add("qwq");



        /*
            如果希望对集合做增删操作，需要自行再创建一个集合并包含数组转换出来集合中的所有元素即可
         */

        ArrayList<String> list2 = new ArrayList<>(list);
//        list2.addAll(list);

        list2.add("seven");
        System.out.println(list2);
        System.out.println(list);
        System.out.println(Arrays.toString(arrays));
    }
}
