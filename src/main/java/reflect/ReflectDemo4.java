package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 使用反射机制调用方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
        Person p = new Person();
        p.sayHello();

//        //实例化
//        Class cls = Class.forName("reflect.Person");
//        Object obj = cls.newInstance();//Person obj = new Person();
//
//        //调用方法
//        //1通过类对象获取其表示的类中要调用的方法所对应的方法对象
//        Method method = cls.getMethod("sayHello");//获取无参方法:sayHello()
//        //2通过方法对象执行该方法
//        method.invoke(obj);//obj.sayHell();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名:");
        String className = scanner.nextLine();
        System.out.println("请输入方法名:");
        String methodName = scanner.nextLine();

        //实例化
        Class cls = Class.forName(className);
        Object obj = cls.newInstance();

        //调用方法
        //1通过类对象获取其表示的类中要调用的方法所对应的方法对象
        Method method = cls.getMethod(methodName);
        //2通过方法对象执行该方法
        method.invoke(obj);
    }
}






