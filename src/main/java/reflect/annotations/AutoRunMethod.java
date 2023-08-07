package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoRunMethod {
    /*
        注解中可以定义参数，格式:
        类型 参数名() [default 默认值];

        如果参数不指定默认值，那么使用该注解时必须为该参数赋值，否则编译不通过
        当注解中仅有一个参数时，参数名应当使用"value"。

        -----------------------------------------------------------------

        原因:
        实际使用注解时,传参的语法:参数名=参数值.当多个参数时顺序可以与注解定义参数时的
        顺序不一致.
        例如:
        public @interface AutoRunMethod {
            int num() default 1;
            String name() default "无名氏";
        }

        此时在使用上述注解时,需要为两个参数传参时,语法:
        @AutoRunMethod(num=2,name="张三")
        也可以
        @AutoRunMethod(name="张三",num=2)

        -----------------------------------------------------------------
        但是如果注解仅有一个参数:
        public @interface AutoRunMethod {
            int num() default 1;
        }
        此时使用注解传参时:
        @AutoRunMethod(num=2)   此时添加参数名略显累赘

        -----------------------------------------------------------------

        因此如果注解仅有一个参数时,java建议我们使用"value"作为参数名,此时使用注解传参时
        可以忽略参数名
        例如:
        public @interface AutoRunMethod {
            int value() default 1;
        }
        使用注解传参时:
        @AutoRunMethod(2)     此时传参不必指定参数名

        -----------------------------------------------------------------

        需要注意,如果注解中有多个参数时,就算其中之一叫做value,传参时参数名也不可以忽略
        例如:
        public @interface AutoRunMethod {
            int value() default 1;
            String name() default "无名氏";
        }
        使用注解传参时:
        @AutoRunMethod(value=2,name="张三")
        @AutoRunMethod(name="张三",value=2)
        但是不可以:
        @AutoRunMethod(2,name="张三")
        @AutoRunMethod(name="张三",2)

        但是如果参数指定了默认值,那么可以忽略参数
        例如:
        @AutoRunMethod(name="张三")  忽略value,那么value使用默认值(前提是value使用default指定了默认值)
     */
//    int num() default 1;
//    String name() default "无名氏";

    int value() default 1;

}
