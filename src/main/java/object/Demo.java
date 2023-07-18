package object;

/**
 * java中
 */
public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1,2);

        System.out.println(p.toString());
        /*
            在日常开发中我们经常会将一个对象输出到控制台来了解对象的内容
            如果没有重写toString方法，看到的是类名@地址，这对我们的调试代码帮助不大
            因此我们会重写toString方法，来输出
         */

        System.out.println(p);
    }
}

