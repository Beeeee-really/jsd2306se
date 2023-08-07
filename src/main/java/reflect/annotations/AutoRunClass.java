package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解在使用时可以是元素注解进行限定
 * <p>@Target:注解用于指定当前注解可以被应用的位置
 *
 * <p>String[] array = {"one","two",","three"};</p>
 */
@Target({ElementType.TYPE})//只能用在类上
@Retention(RetentionPolicy.RUNTIME)//保留级别
public @interface AutoRunClass {
}
