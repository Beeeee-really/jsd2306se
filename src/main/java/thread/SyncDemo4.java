package thread;

/**
 * 当使用多个...
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread t1 = new Thread(foo::methodA);
        Thread t2 = new Thread(foo::methodB);

        t1.start();
        t2.start();
    }
}

class Foo {
    public synchronized void methodA() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + ":正在执行A方法");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("执行完毕");
    }


    public synchronized void methodB() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + ":正在执行B方法");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("执行完毕");
    }
}
