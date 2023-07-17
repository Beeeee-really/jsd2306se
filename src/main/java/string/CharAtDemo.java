package string;

/**
 * "".charAt();
 * <p>返回指定字符串的指定字符
 *
 * @author Administrator
 */
public class CharAtDemo {
    public static void main(String[] args) {
        System.out.println("qwq wq wq".charAt(2));


        String str = "上海自来水来海自上";
        for (int i = 0; i < str.length() / 2; i++) {
            char c1 = str.charAt(i);//获取正数位置的字符
            char c2 = str.charAt(str.length() - 1 - i);//获取倒数位置的字符
            if (c1 != c2) {
                System.out.println("不是回文");
                return;
            }
        }
        System.out.println("是回文");
    }
}
