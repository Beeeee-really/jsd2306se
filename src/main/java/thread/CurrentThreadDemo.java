package thread;

/**
 * java中所有的代码都是靠线程运行的
 * 线程Thread提供了一个静态方法
 * static Thread currentThread()
 * 该方法会返回一个运行这个方法的线程(当前线程)
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();//获取运行main方法的主线程
        System.out.println(main);
        doSome();
    }

    public static void doSome() {
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}
