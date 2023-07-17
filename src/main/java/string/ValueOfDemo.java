package string;


/**
 * String提供了一组静态方法:valueOf
 * <p>用于将java中其他类型转换为String
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int a = 123;
        String s1 = String.valueOf(a);
        System.out.println(s1);
    }
}
