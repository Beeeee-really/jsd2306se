package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("Tom");
//        list.add("qwq");
//        list.add("awa");
//        list.add("see");
//        list.add("fgf");
        list.add("请问");
        list.add("你");
        list.add("驱蚊器");
        System.out.println(list);
//        Collections.sort(list);
        /*
            定义比较器：字符多的大
         */
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();//降序
//                return o1.length() - o2.length();//升序
            }
        };
        Collections.sort(list, c);
        System.out.println(list);


    }
}
