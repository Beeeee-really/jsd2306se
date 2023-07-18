package string;

/**
 * 由于字符串不适合修改，因此java提供了一个专门用于修改字符串的工具类:StringBuilder
 */
public class StingBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();//创建无参构造器
        int len = builder.length();
        System.out.println(len);

        builder = new StringBuilder("hello world!");
        len = builder.length();
        System.out.println(len);
    }
}
