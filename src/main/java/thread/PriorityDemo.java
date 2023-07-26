package thread;

/**
 * 线程的优先级
 * <p>线程有十个优先级，分别对应整数1-10，其中1是最低优先级，5是默认，10为最高
 * <p>
 * <p>线程调用start方法启动后就纳入到了线程调度器中被统一管理，此时线程不能主动索取时间片
 * <p>只能被动分配，调度器是可能均匀的将时间片分配给每个线程，是他们可以并发运行
 * <p>调整线程的优先级可以将最大程度地干涉调度器分配时间片的几率，优先级越高的线程时间片越多
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("hello world!");
                }
            }
        };
        Thread max = new Thread() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("hello java!");
                }
            }
        };

        Thread nor = new Thread() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("hi!");
                }
            }
        };

        //设置优先级
        min.setPriority(Thread.MAX_PRIORITY);//设置优先级
        max.setPriority(Thread.MIN_PRIORITY);//线程的最小/最大优先级
        nor.setPriority(Thread.NORM_PRIORITY);

        min.start();
        max.start();
        nor.start();
    }
}
