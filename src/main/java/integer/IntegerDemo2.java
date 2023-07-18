package integer;

/**
 * 包装类使用功能
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        /*
            所有数字类型的包装类型都有两个常量:MAX_VALUE和MIN_VALUE
            表示对应类型的最大值与最小值
         */
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax = Long.MAX_VALUE;
        System.out.println(lmax);
        long lmin = Long.MIN_VALUE;
        System.out.println(lmin);
    }
}
