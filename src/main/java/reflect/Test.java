package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 利用反射
 * 分别用无参和有参构造器实例化Student
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflect.Student");
        Object o1 = cls.newInstance();
        System.out.println(o1);

        Constructor constructor = cls.getConstructor(String.class,int.class,char.class);//Student(String, int, char)
        Object o2 = constructor.newInstance("李四",22,'女');
        System.out.println(o2);

    }
}
