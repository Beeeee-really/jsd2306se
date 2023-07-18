package integer;

/**
 * JDK5推出时，推出了一个新的特性：自动拆装箱
 * 在源代码中我们可以直接将基本类型和包装类类型之间相互赋值，而无需添加转换代码
 * Integer i = 123;//基本类型可以直接复制给引用类型
 *
 */
public class IntegerDemo3 {
    public static void main(String[] args) {
        int num = 123;
//        Integer i = Integer.valueOf(num);
        /*
            编译器会将代码改为：
            Integer i = Integer.valueOf(num);
            补充代码将基本类型转换为包装类的过程为：自动装箱
         */
        Integer i = num;
        /*
            编译器会将代码改为：
            num = i.intValue();
            补充代码将包装类转换为包装类的过程为：自动拆箱
         */
//        num = i.intValue();
        num = i;
        doSome(i);
        doSome(num);
    }

    public static void doSome(Object o) {

    }
}
