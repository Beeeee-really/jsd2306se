package object;

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
        /*
            当一个对象与字符串进行连接操作时，JVM也会调用它的toString方法先将其
            转换为字符串后再进行连接
         */
        line = "这是一个Point类的实例" + p;
        System.out.println(line);


        /*
            面试题：
            对于引用类型而言，"=="与equals的区别是什么？
            对于引用类型变量而言，变量保存的值是地址
            "=="是值比较，所以比较的就是变量地址
            那么对于引用类型变量而言==的比较含义是:他们是否指向同一个对象

            equals方法是Object定义的方法，本意是表达两个对象的内容是否相同
            但是Object默认实现内部使用"=="进行了比较，因此子类若希望使用equals比较对象则需要重写该方法
         */
        Point p2 = new Point(1,2);
        System.out.println(p==p2);//false
        System.out.println(p.equals(p2));//true
    }
}

