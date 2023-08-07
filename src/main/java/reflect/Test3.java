package reflect;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 调用与当前类Test3在同一个包中,那些类中所有本类定义的公开且无参的方法
 *
 * 1:知道与Test3在同一个包下都有那些类?
 *   加载一个类的类对象需要:Class.forName("包名.类名");
 *   包名可以确定,可以参考Test3的包名
 *   类名怎么确定?
 *   1.1:先定位到Test3这个类所在的目录
 *   1.2:获取该目录中所有文件(File对象)
 *   1.3:通过File对象可以获取该文件的文件名,由于java的命名要求类名要与文件名一致
 *       所以通过文件名就可以确定类名
 * 2:参考Test2案例,将每个类中所有本类定义的无参且公开的方法逐一调用
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        /*
            相对路径:
            File dir = new File(
                类名.class.getClassLoader().getResource(".").toURI()
            );
            上述方式是定位类加载路径,在maven项目中相当于:target/classes


            还有一个常用的:当前类所在的目录(所在的包)
            File dir = new File(
                类名.class.getResource(".").toURI()
            );
            需要注意,由于JVM是加载.class文件的,因此这个目录是该类对应的字节码文件所在的目录

            例如:
             File dir = new File(
                Test3.class.getResource(".").toURI()
             );
             定位的就是Test3.class文件所在的目录.本项目相当于定位是:
             target/classes/reflect目录
         */
        //定位包
        File dir = new File(
                Test3.class.getResource(".").toURI()
        );
        //获取其中所有的.class文件
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        //遍历每一个class文件
        for (File sub : subs){
            //通过文件名获取类名
            String fileName = sub.getName();//Person.class
            String className = fileName.substring(0,fileName.indexOf("."));
            //确定包名
            String packName = Test3.class.getPackage().getName();
            //类的完全限定名
            className = packName+"."+className;

            //加载类对象
            System.out.println("加载:"+className);
            Class cls = Class.forName(className);
            //实例化
            Object obj = cls.newInstance();

            //通过类对象获取该类定义的所有方法
            Method[] methods = cls.getDeclaredMethods();
            for(Method method : methods){
                if(method.getModifiers()== Modifier.PUBLIC&&
                   method.getParameterCount()==0){
                    System.out.println("调用方法:"+method.getName()+"()");
                    method.invoke(obj);
                }
            }
        }


    }
}
