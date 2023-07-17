package string;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        String s2 = "123abc";
        String s3 = "123abc";

        System.out.println(s1.equals(s2));
        System.out.println("qwq");
        /**
         * ==  只比较地址
         *
         * @author Bee
         */
        System.out.println(s2.equals(s1));
    }

}
