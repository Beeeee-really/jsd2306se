package string;

/**
 * String 是不变对象，修改内容时会创建新对象
 * <p>因此String不适合频繁修改，性能低，开销大
 * <p>
 * @author Beeeee
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str = "a";
        for (int i = 1; i < 999999999; i += 1) {
            str = str + "a";//超时

        }
        System.out.println("Oh");
    }
}
