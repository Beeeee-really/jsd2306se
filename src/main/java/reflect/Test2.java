package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 使用反射机制调用Person类,本类中所有公开的无参方法
 *
 * 1:加载Person的类对象
 * 2:通过类对象可以获取该类定义的所有方法
 * 3:遍历所有方法,并判断该方法是否为公开的且无参的,如果是则invoke执行即可
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            if(
                    method.getModifiers()== Modifier.PUBLIC
                                &&
                    method.getParameterCount()==0
            ){
                method.invoke(obj);
            }
        }

    }
}
