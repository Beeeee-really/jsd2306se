package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;

/**
 * 调用与当前类Test4在同一个包中被@AutoRunClass标注的类中那些被@AutoRunMethod标注的方法
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
        File dir = new File(
          Test4.class.getResource(".").toURI()
        );
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for(File sub : subs){
            String fileName = sub.getName();
            String className = fileName.replace(".class","");
            String packName = Test4.class.getPackage().getName();
            Class cls = Class.forName(packName+"."+className);
            //如果该类被注解@AutoRunClass标注
            if(cls.isAnnotationPresent(AutoRunClass.class)){
                System.out.println("实例化对象:"+className);
                Object obj = cls.newInstance();//实例化
                //获取该类定义的所有方法
                Method[] methods = cls.getDeclaredMethods();
                for(Method method : methods){
                    //如果该方法被注解@AutoRunMethod标注
                    if(method.isAnnotationPresent(AutoRunMethod.class)){
                        System.out.println("调用方法:"+method.getName()+"()");
                        method.invoke(obj);
                    }
                }
            }
        }
    }
}
