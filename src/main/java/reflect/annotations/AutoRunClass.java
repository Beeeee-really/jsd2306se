package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  注解在使用时可以使用元注解进行限定:
 *  @Target:注解用于指定当前注解可以被应用的位置,不添加时注解可以被应用在任何
 *          可以使用的位置
 *          指定的位置使用ElementType来指定
 *          常见的有:
 *          ElementType.TYPE:在类上使用
 *          ElementType.FIELD:在属性上使用
 *          ElementType.METHOD:在方法上使用
 *          ElementType.CONSTRUCTOR:在构造器上使用
 *          ....
 *
 *          例如:
 *          @Target(ElementType.CLASS)
 *          当前注解只能被应用于类上
 *
 *          @Target({ElementType.TYPE,ElementType.CONSTRUCTOR})
 *          当前注解可以被应用于类上和构造器上(多个位置时要以数组的形式表达)
 *
 * @Retention注解:用于标注被标注的注解的保留级别.
 *           保留级别有三种:
 *           RetentionPolicy.SOURCE:注解仅保留在源代码中,编译后的字节码文件中被舍弃
 *           RetentionPolicy.CLASS:保留在字节码文件中,但是不可被反射机制访问
 *           RetentionPolicy.RUNTIME:保留在字节码文件中,可被反射机制访问
 *
 *           注:当不指定@Retention时,默认的保留级别为RetentionPolicy.CLASS
 *
 *           例如:
 *           @AutoRunClass
 *           public class Person{
 *               ...
 *           }
 *           如果@AutoRunClass的保留级别设定为RetentionPolicy.RUNTIME,那么反射机制
 *           在访问Person类时可以看到它上面的注解@AutoRunClass,否则访问不到.
 */
//@Target({ElementType.TYPE,ElementType.CONSTRUCTOR})
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoRunClass {

}
