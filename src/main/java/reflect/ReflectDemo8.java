package reflect;

import reflect.annotations.AutoRunClass;

/**
 * 反射机制访问类上的注解
 */
public class ReflectDemo8 {
    public static void main(String[] args) throws ClassNotFoundException {
        //查看Person类上是否有注解
        Class cls = Class.forName("reflect.Student");

        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
        if (mark){
            System.out.println("标注");
        }else{
            System.out.println("没有标注");
        }
    }
}
