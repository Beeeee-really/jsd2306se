package exception;

/**
 * finally块
 * <p></p>finally块是异常处理机制的最后一块，它可以跟在try之后。或者最后一个catch之后
 * <p>finally可以保证只要程序执行到try语句块中，无论try中是否异常都执行
 * <p>因此我们将必走的代码放在finally中
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String line = null;
//            String line = "abc";
            System.out.println(line.length());
            return;
        } catch (Exception e) {
            System.out.println("出错了");
        } finally {
            System.out.println("finally中的代码执行了");
        }


        System.out.println("程序结束了");
    }
}
