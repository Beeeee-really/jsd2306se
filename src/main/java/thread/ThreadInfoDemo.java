package thread;

/**
 * 获取线程相关信息的一组方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();

        String name = main.getName();
        System.out.println(name);

        //获取一个线程的唯一标识
        long id = main.getId();
        System.out.println("id:" + id);

        int priority = main.getPriority();
        System.out.println("优先级:" + priority);

        //线程是否活着
        boolean isAlive = main.isAlive();

        //是否为一个守护线程
        boolean isDaemon = main.isDaemon();

        //线程是否中断
        boolean isInterrupted = main.isInterrupted();

        System.out.println("是否活着:" + isAlive);
        System.out.println("是否是一个守护线程:" + isDaemon);
        System.out.println("是否中断:" + isInterrupted);

    }
}
