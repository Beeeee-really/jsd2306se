package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

/**
 * 使用反射机制获取注解参数
 */
public class ReflectDemo9 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        if(cls.isAnnotationPresent(AutoRunClass.class)){
            Method method = cls.getDeclaredMethod("sayHello");
            //查看sayHello方法是否被注解@AutoRunMethod标注?
            if(method.isAnnotationPresent(AutoRunMethod.class)){
                /*
                    所有的反射对象上都支持获取注解的操作:
                    getAnnotation(Class cls)
                 */
                //通过方法对象获取在该方法上的注解@AutoRunMethod
                AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
                //通过注解对象获取其中的参数"value"的值
                int value = arm.value();
                System.out.println("参数值为:"+value);

            }

        }
    }
}
