package integer;

/**
 * java为8个基本类型提供了对应的8个包装类
 * <p>包装类的出现是让基本类型以对象的形式呈现，可以参与面向对象开发
 * <p>
 * <p>byte       Byte
 * <p>short      Short
 * <p>int        Int
 * <p>long       Long
 * <p>float      Float
 * <p>double     Double
 * <p>boolean    Boolean
 * <p>char       Character
 *
 * @author Beeeee
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        int num = 128;
//        Integer i1 = num;
//        System.out.println("i1:" + i1);
//        Integer i2 = num;
//        System.out.println("i2:" + i2);

        /*
            java推荐我们将基本类型转换为对应包装类是使用包装类的静态方法valueOf()

            对于Integer的valueOf方法总是缓存-128-127之间数字对象进行重用
         */
        Integer i1 = Integer.valueOf(num);
        Integer i2 = Integer.valueOf(num);

        System.out.println(i1 == i2);
        System.out.println(i1.equals(num));

        double dou = 123.123;
        Double d1 = Double.valueOf(dou);
        Double d2 = Double.valueOf(dou);

        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));

        int i = i1.intValue();
        System.out.println(i);
        long l = i1.longValue();
        System.out.println(l);
        double d = i1.doubleValue();
        System.out.println(d);
        byte b = i1.byteValue();
        System.out.println(b);//byte b = 127 + 1;
    }
}
