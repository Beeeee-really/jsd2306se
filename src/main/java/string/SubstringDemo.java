package string;

/**
 * String substring(int start,int end);
 * 截取当前字符串中自定范围内的字符串
 * 注：在java API中，当时用两个数字表示范围时，通常表示含头不含尾
 */
public class SubstringDemo {
    public static void main(String[] args) {
        String line = "www.tedu.cn";
        System.out.println(line.substring(4, 8));
    }
}
