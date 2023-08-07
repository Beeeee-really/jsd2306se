package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

/**
 * 反射机制访问类上的注解
 */
public class ReflectDemo8 {
    public static void main(String[] args) throws Exception {
        //查看Person类上是否有注解@AutoRunClass
        Class cls = Class.forName("reflect.Person");
        /*
            所有反射对象都有方法:
            boolean isAnnotationPresent(Class cls)
            用于判断该反射对象表示的内容上是否被参数类对象标示的注解标注

            常见的反射对象:
            Class:类对象,该类的每一个实例用于表示一个类
            Package:包对象,该类每个实例用于表示一个包
            Method:方法对象,每个实例用于表示一个方法
            Constructor:构造器对象,每个实例用于表示一个构造器
            Field:属性对象,每个实例用于表示一个属性
         */
        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
        if(mark){
            System.out.println("被标注了!");

            //查看sayHello方法是否被注解@AutoRunMethod标注
            Method method = cls.getDeclaredMethod("sayHello");
            mark = method.isAnnotationPresent(AutoRunMethod.class);
            if(mark){
                System.out.println(method.getName()+"()被标注了");
            }else{
                System.out.println(method.getName()+"()没有被标注了");
            }



        }else{
            System.out.println("没有被标注!");
        }


    }
}
