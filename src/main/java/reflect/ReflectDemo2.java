package reflect;

import java.util.Scanner;

/**
 * 通过反射机制实例化对象
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person p = new Person();//编码方式实现实例化
        System.out.println(p);
        /*
            反射机制实例化对象
            1:加载要实例化对象的类的类对象
            2:通过类对象进行实例化
         */
        //1
//        Class cls = Class.forName("reflect.Person");
        /*
            java.util.ArrayList
            java.util.HashMap
            java.util.Date

            java.io.FileInputStream不可以，因为它没有无参构造器
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个类名:");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);

        /*
            2
            Class提供了一个重要的方法:
            Object newInstance()
            该方法会利用类对象所表示的类的【公开的，无参构造器】实例化对象
         */
        Object o = cls.newInstance();//new Person();
        System.out.println(o);
    }
}
