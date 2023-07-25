package thread;

/**
 * 使用匿名内部类形式创建线程
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    System.out.println("你是谁啊?");
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("开门!");
                }
            }
        };
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
