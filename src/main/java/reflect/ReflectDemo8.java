package reflect;

import reflect.annotations.AutoRunClass;

import java.lang.reflect.Method;

/**
 * 反射机制访问类上的注解
 */
public class ReflectDemo8 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //查看Person类上是否有注解
        Class cls = Class.forName("reflect.Person");

        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
        if (mark){
            System.out.println("标注");

            //查看SayHello类是否标注
            Method method = cls.getDeclaredMethod("sayHello");
            mark = method.isAnnotationPresent(AutoRunClass.class);
            if (mark){
                System.out.println(method.getName()+"()被标注了");
            }
        }else{
            System.out.println("没有标注");
        }


    }
}
