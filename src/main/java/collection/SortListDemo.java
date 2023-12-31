package collection;

import java.util.*;

/**
 * 集合的排序
 * <p></p>集合的工具类:java.util.Collection提供了一个静态方法sort,可以对List集合排序
 * <p>自然排序
 * <p>
 *
 * @author Beeeee
 */
public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i += 1) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

//        Collections.sort(list);

        //定义比较器
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }


        };
        Collections.sort(list, c);
        System.out.println(list);
    }
}
