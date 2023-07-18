package string;

/**
 * 字符串支持正则表达式三
 * <p>String replaceAll(String regex,String str);
 * <p>将当前字符串中满足正则表达式的部分替换为给定那内容
 * <p>
 *
 * @author Beeeee
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi";


        /*
            将当前字符串line中的数字部分替换为#NUMBER#
         */
        String str = line.replaceAll("[0-9]+", "#NUMBER#");
        System.out.println(str);


        /*
            将当前字符串line中的字母部分替换为#WORD#
         */
        str = line.replaceAll("[a-zA-Z]+", "#WORD#");
        System.out.println(str);
    }
}
