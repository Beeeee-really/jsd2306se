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


        line = "abc.def.ghi";
        data = line.split("\\.");
        System.out.println(Arrays.toString(data));

        line = "abc==def==ghi";
        data = line.split("=");
        System.out.println(Arrays.toString(data));
        /*
            当出现连续可拆分项时，中间会多拆分出一个空字符
            如果是字符串最开始时是可拆分项，那么之前会拆分出一个空字符
            注意：如果字符串末尾连续出现可拆分项时，那么后面的空字符全部忽略
         */
    }
}
