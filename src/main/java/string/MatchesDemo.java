package string;

import java.util.Scanner;

/**
 * String支持正则表达式的方法一：
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否符合格式要求，否则返回false
 * <p>
 *
 * @author Beeeee
 */
public class MatchesDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email;
        while (true) {
            System.out.println("输入邮箱地址：");
            email = scan.next();
        /*
            用户名@域名.后缀
            [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
         */
            String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";

            if (email.matches(regex)) {
                System.out.println("是邮箱");
                break;
            } else {
                System.out.println("不是邮箱");
            }


        }
    }
}
