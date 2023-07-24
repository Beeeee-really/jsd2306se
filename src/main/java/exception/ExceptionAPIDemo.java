package exception;

/**
 * 异常中的常用的用法
 */
public class ExceptionAPIDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String name = "abc";
            System.out.println(Integer.parseInt(name));
        } catch (NumberFormatException e) {
            System.out.println("出错了");
            System.err.println(e.getMessage());
        }
        System.out.println("程序结束了");
        System.err.println("程序结束了");
    }
}
