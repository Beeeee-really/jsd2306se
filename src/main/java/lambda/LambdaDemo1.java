package lambda;

import java.util.Comparator;

/**
 * JDK8之后推出了一个新的特性:lambda表达式
 * <p></p>lambda表达式可以使用更精简的语法创建匿名内部类
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        //创建比较器(为字符串提供一种比较规则)
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        //lambda表达式写法,方法中参数的类型可以忽略不写
        Comparator<String> c2 = (String o1, String o2) -> {
            return o1.length() - o2.length();
        };

        Comparator<String> c3 = (o1, o2) -> {
            return 0;
        };

        Comparator<String> c4 = (o1, o2) -> o1.length() - o2.length();//适用于一句代码
//        Comparator<String> c4 = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        }
    }
}
