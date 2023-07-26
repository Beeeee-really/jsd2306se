package thread;

/**
 * sleep方法要求必须处理异常
 * <p></p>当一个线程调用sleep方法进入阻塞的过程中该线程的interrupt()方法被调用，那么该线程会立即中断
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread("awa") {
            public void run() {
                System.out.println(getName() + ":睡一会儿吧!");
                try {
                    Thread.sleep(5000000);
                } catch (InterruptedException e) {
                    System.out.println(getName() + ":醒了...");
                    System.out.println(getName() + ":╰（‵□′）╯");
                }
            }

        };
        Thread huang = new Thread("qwq") {
            public void run() {
                System.out.println(getName() + ":大锤80，小锤40，开始砸墙!");
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName() + ":80!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(getName()+":aaa");
                System.out.println("(o′┏▽┓｀o) ");
                lin.interrupt();//中断lin的睡眠阻塞
            }
        };
        huang.start();
        lin.start();
    }
}
