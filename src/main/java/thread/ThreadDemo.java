package thread;

/**
 * 线程的第一种创建方式
 * <p>继承Thread类并重写run方法
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("你是谁啊?");
//        }
//
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("开门!");
//        }//顺序执行方式
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁啊?");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("开门!");
        }
    }
}
