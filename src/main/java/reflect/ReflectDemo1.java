package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * java反射机制
 * 反射是java的动态机制，允许程序在【运行期间】再确定对象实例化，方法调用，属性操作等。
 * 反射可以提高代码的灵活性，可扩展性。但是也随之带来了较低的运行效率和更多的资源开销。
 * 因此反射不能被过度的使用
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
            反射操作的第一步，获取要操作类的类对象，即:Class实例

            Class类，通常称为一个类的类对象。当JVM需要使用一个类时首先会读取该类的.class文件
            加载这个类，于此同时就会实例化一个Class的实例并用其记录加载类的信息。这个Class的
            实例对于加载的类而言只会实例化一个并与之绑定。
            因此获取一个类对应的Class实例就可以得知该类的一切信息从而在程序运行期间对这个类
            进行响应的操作。

            获取一个类的类对象:
            1:类名.class
              Class cls = String.class;
              Class cls = int.class;
              注意:基本类型仅有上述一种方式可以获取类对象

            2:Class.forName(String className)
              通过指定一个类的"完全限定名"即:包名.类名 来获取该类的类对象
              Class cls = Class.forName("java.lang.String");

            3:类加载器ClassLoader
         */

        //获取String的类对象
//        Class cls = String.class;
//        Class cls = ArrayList.class;

//        Class cls = Class.forName("java.lang.String");
        /*
            java.util.HashMap
            java.util.ArrayList
            java.lang.String
            java.io.FileInputStream
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个类名:");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);

        //通过类对象获取其表示的类的完全限定名
        String name = cls.getName();
        System.out.println(name);
        //仅获取类名
        name = cls.getSimpleName();
        System.out.println(name);
        /*
            java.lang.Package是常见的反射对象之一，包对象
            该类的每一个实例用于表示一个包的信息
         */
        Package pack = cls.getPackage();
        //通过包对象获取它表示的包的名字
        String packName = pack.getName();
        System.out.println(packName);
        /*
            java.lang.reflect.Method 方法对象，它也是常见的反射对象之一
            它的每一个实例用于表示一个方法的信息，通过它可以获取它表示的方法的相关内容:
            访问修饰符，返回值类型，方法名，参数列表信息，还可以用来执行这个方法


            Class中的方法:
            Method[] getMethods()
            可以获取当前类对象所表示的类中所有的公开方法(包含从超类继承的方法)，该数组中
            每个Method实例表示其中一个公开方法
         */

        Method[] methods = cls.getMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }

    }
}


