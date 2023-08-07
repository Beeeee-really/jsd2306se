package reflect;

import java.lang.reflect.Method;

/**
 * 调用有参方法
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.say("hello!!!");

        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        Method method = cls.getMethod("say",String.class);//say(String)
        method.invoke(obj,"大家好");//obj.say("大家好!");


        Method m2 = cls.getMethod("say",String.class,int.class);//say(String,int)
        m2.invoke(obj,"你好",5);//obj.say("你好",5);
    }
}
