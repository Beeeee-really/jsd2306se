package string;

import java.util.Arrays;

/**
 * String支持正则表达式二
 * String[] split(String)
 */
public class SplitDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        /*
            abc123def456ghi
            按照数字部分进行拆分，读取所有英文部分
         */
        String[] data = line.split("[0-9]+");
        System.out.println(data.length);
        System.out.println(Arrays.toString(data));//将数组变为字符串：[abc, def, ghi]
    }
}
