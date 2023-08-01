package map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Map是一个接口
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();//有序


        map.put("语文", 999);
        map.put("qwq", 121);
        map.put("awa", 990);
        map.put("UoU", 101010);
        Integer value = map.put("qwq", 1);
        System.out.println(value);
        System.out.println(map);

        int size = map.size();
        System.out.println(size);

        value = map.get("qwq");
        System.out.println(value);

        value = map.get("qaadadad");
        System.out.println(value);

        value = map.remove("qwq");
        System.out.println(value);
        System.out.println(map);


        boolean ck = map.containsKey("awa");
        boolean cv = map.containsValue(1111);
        System.out.println(ck);
        System.out.println(cv);

        map.clear();
        System.out.println(map);
    }

}
