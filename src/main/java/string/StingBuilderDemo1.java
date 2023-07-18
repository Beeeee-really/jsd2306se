package string;

/**
 * 由于字符串不适合修改，因此java提供了一个专门用于修改字符串的工具类:StringBuilder
 * <p>
 * @author Beeeee
 */
public class StingBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();//创建无参构造器
        int len = builder.length();
        System.out.println(len);

        builder = new StringBuilder("hello world!");
        len = builder.length();
        System.out.println(len);

        /*
            StringBuilder append(String str);
            将给定的内容加到字符串末尾，相当于"+"操作

            提供了若干重载，任何java类型都可以作为参数加入，用于与当前字符串连接
         */
        builder.append("hello java!");
        len = builder.length();
        System.out.println(len);
        String line = builder.toString();//将当前StringBuilder的内容以String形式返回
        System.out.println(line);
    }
}
