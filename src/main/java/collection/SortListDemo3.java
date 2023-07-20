package collection;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(list);
        System.out.println(list);

    }
}
