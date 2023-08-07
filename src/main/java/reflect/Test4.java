package reflect;

import reflect.annotations.AutoRunClass;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

/**
 * 调用当前类Test4在同一个包中被@AutoRunClass标注的类中的那些被@AutoRunClass标注的方法
 */
public class Test4 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException, URISyntaxException {
        File dir = new File(
                Test4.class.getResource(".").toURI()
        );
        File[] subs = dir.listFiles(f -> f.getName().endsWith(".class"));
        for (File sub : subs) {
            String fileName = sub.getName();
            String className = fileName.replace(".class", "");
            String packName = Test4.class.getPackage().getName();
            Class cls = Class.forName(packName + "." + className);
            if (cls.isAnnotationPresent(AutoRunClass.class)) {
                Object obj = cls.newInstance();
                Method[] methods = cls.getDeclaredMethods();
                for (Method method : methods) {
                    System.out.println("调用方法:" + method.getName() + "()");
                    method.invoke(obj);
                }
            }
        }
    }
}
