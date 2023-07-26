package thread;

/**
 * 静态方法上使用
 */
public class SyncDemo3 {
    public static void main(String[] args) {
//        Thread t1 = new Thread(() -> Boo.doSome());

        Thread t1 = new Thread(Boo::doSome);
        Thread t2 = new Thread(Boo::doSome);
        t1.start();
        t2.start();
    }
}


class Boo {
    public synchronized static void doSome() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + ":正在执行doSome方法...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
