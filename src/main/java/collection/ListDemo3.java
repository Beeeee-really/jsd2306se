package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start,int end)
 * <p>
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i += 1) {
            list.add(i);
        }
        System.out.println(list);

//        获取list集和中的3-7
        List<Integer> sublist = list.subList(3, 8);
        System.out.println(sublist);

        //将subList中每个元素扩大10倍

        //[30,40,50,60,70
//        for (int i = 0; i < list.size(); i += 1) {
//            int d = (int) list.get(i);
//            d = d * 10;
//            list.set(i, d);
//        }
        for (int i = 0; i < sublist.size(); i += 1) {
            sublist.set(i, sublist.get(i) * 10);
        }
        System.out.println(sublist);
        System.out.println(list);

        //删除list集合中2-8
        list.subList(2,9).clear();

        System.out.println(list);//[0,1,9]
    }
}
