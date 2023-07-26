package thread;

/**
 * 睡眠阻塞
 * <p></p>Thread提供了一个静态方法:
 * <p>static void sleep(long ms)
 * <p>该方法可以让一个线程进入阻塞状态，超时后线程会回到RUNNABLE状态
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("程序结束了");
    }
}
