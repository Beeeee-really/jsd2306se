package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Method对象常见操作
 */
public class ReflectDemo6 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = Class.forName("reflect.Person");
        //获取所有公开方法,包含从超类继承的
//        Method[] methods = cls.getMethods();

        //获取本类自己定义的所有方法,包含私有成员
        Method[] methods = cls.getDeclaredMethods();

        for(Method method : methods){
            System.out.println(method.getName());
            //获取该方法的访问修饰符
            int modifiers = method.getModifiers();
            //根据访问修饰符的不同输出
            switch (modifiers){
                case Modifier.PUBLIC:
                    System.out.println("这是一个public方法");
                    break;
                case Modifier.PRIVATE:
                    System.out.println("这是一个私有方法");
                    break;
                case Modifier.PROTECTED:
                    System.out.println("这是一个受保护方法");
                    break;
            }

            //获取该方法的参数个数
            int pc = method.getParameterCount();
            System.out.println("参数个数:"+pc);


        }

    }
}
