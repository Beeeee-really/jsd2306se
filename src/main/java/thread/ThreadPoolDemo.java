package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建固定大小的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    Thread t = Thread.currentThread();
                    System.out.println(t.getName() + "正在执行任务");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(t.getName() + "执行任务完毕");
                }
            };
            threadPool.execute(r);
            System.out.println("将一个任务交给了线程池处理");
        }

//        threadPool.shutdown();
//        System.out.println("线程池关闭了");
        threadPool.shutdownNow();
        System.out.println("线程池关闭了");//报错
    }
}
