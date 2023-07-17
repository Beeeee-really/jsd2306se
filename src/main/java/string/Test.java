package string;

/**
 * 课堂练习
 * <p>实现方法：完成截取网址中的域名
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "https://www.tedu.cn";
        String s2 = "www.example.gg.com.io.org.cn/qwq";
        System.out.println(getHostName(s1));
        System.out.println(getHostName(s2));
    }


    public static String getHostName(String str) {

        return str.substring(str.indexOf(".") + 1, str.lastIndexOf("."));
    }
}
