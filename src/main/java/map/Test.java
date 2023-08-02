package map;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String line = "qwq qwq qwq qwq qwq qwq qwq qwq";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (map.containsKey(c)) {
                int num = map.get(c);
                num += 1;
                map.put(c, num);

            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
