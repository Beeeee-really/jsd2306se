package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 调用有参构造器实例化对象
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person p = new Person("李四",22);
        System.out.println(p);

        Class cls = Class.forName("reflect.Person");
        /*
            通过类对象获取指定的构造器
            Constructor getConstructor(Class ...)

            java.lang.reflect.Constructor 常见的反射对象，构造器对象
            它的每一个实例用于表示一个类的构造器
            其中有一个重要的方法
            Object newInstance(Object...)
         */
        Constructor c = cls.getConstructor(String.class,int.class);//Person(String,int)
        Object obj = c.newInstance("王五",33);//new Person("王五",33);
        System.out.println(obj);




    }
}
