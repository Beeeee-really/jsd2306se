package object;

/**
 * java中
 */
public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1, 2);

        String line = p.toString();
        System.out.println(line);
        /*
            在日常开发中我们经常会将一个对象输出到控制台来了解对象的内容
            如果没有重写toString方法，看到的是类名@地址，这对我们的调试代码帮助不大
            因此我们会重写toString方法，来输出体现该对象内容的字符串
         */

        System.out.println(p);

        line = "这是一个Point类的实例" + p;
        System.out.println(line);
    }
}

