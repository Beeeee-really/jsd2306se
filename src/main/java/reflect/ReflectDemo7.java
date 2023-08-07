package reflect;

import java.lang.reflect.Method;

/**
 * 暴力反射
 * 反射机制可以访问一个类的私有成员
 */
public class ReflectDemo7 {
    public static void main(String[] args) throws Exception {
//        Person p = new Person();
//        p.hehe();//类的外部不可以访问一个类的私有成员

        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        //getMethod只能获取公开方法
//        Method method = cls.getMethod("hehe");
        Method method = cls.getDeclaredMethod("hehe");
        method.setAccessible(true);//强行打开访问权限
        method.invoke(obj);//obj.hehe();
        method.setAccessible(false);//使用后应当关闭该权限(好习惯)

    }
}






