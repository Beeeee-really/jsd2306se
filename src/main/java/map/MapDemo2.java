package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Map的遍历
 * Map提供了3种遍历方式
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("qwq", 121);
        map.put("awa", 121);
        map.put("zs", 121);
        map.put("we", 121);
        map.put("qf", 121);
        map.put("q", 121);
        map.put("sd", 121);
        map.put("1", 121);
        map.put("2", 121);
        map.put("3", 121);
        map.put("4", 121);
        map.put("5", 121);

        /*
            Set KeySet()
            将当前map中的所有key
         */
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key);
        }

        /*
            遍历每一组键值对
            Set entrySet()
         */
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> e : entrySet) {
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + ":" + value);
        }

        Collection<Integer> values = map.values();
        for (Integer e : values) {
            System.out.println(e);
        }

        map.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}
