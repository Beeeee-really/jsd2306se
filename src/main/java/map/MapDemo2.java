package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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


    }
}
