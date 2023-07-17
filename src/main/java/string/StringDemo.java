package string;

public class StringDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 30};

        String s1 = "123abc";
        String s2 = "123abc";
        String s3 = "123abc";
        String s5 = "qwq";
        /*
        字符串不可改(常量)
        储存在常量池中以减少性能开支
        */

        System.out.println(s1.equals(s2) + s3);
        System.out.println("qwq");
        //== 只比较地址
        /*
        触发了编译器的预计算
        编译器在编译代码时，发现一个计算表达式是不变的
         */
        System.out.println(s2.equals(s1));
        System.out.println(s2 == s5);

        int a_ = 60 * 60 * 24 * 1000;
    }

}
