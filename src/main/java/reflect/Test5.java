package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;

public class Test5 {
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
                        AutoRunMethod arm = (AutoRunMethod) method.getAnnotation(AutoRunClass.class);
                        //从方法上获取注解

                        int value = arm.value();



                        System.out.println("调用方法:"+method.getName()+"()");
                        method.invoke(obj);
                    }
                }
            }
        }
    }
}
