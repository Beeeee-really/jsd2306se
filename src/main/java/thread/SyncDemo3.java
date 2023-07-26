package thread;

/**
 * 静态方法上使用
 */
public class SyncDemo3 {
    public static void main(String[] args) {
//        Thread t1 = new Thread(() -> Boo.doSome());
//
//        Boo b1 = new Boo();
//        Boo b2 = new Boo();
//        Thread t1 = new Thread() {
//            public void run() {
//                b1.doSome();
//            }
//        };
//        Thread t2 = new Thread() {
//            public void run() {
//                b2.doSome();
//            }
//        };


        Thread t1 = new Thread(Boo::doSome);
        Thread t2 = new Thread(Boo::doSome);
        t1.start();
        t2.start();
    }
}


class Boo {
    public static void doSome() {
        synchronized (Boo.class) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在执行doSome方法...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("doSome方法执行完毕!");
        }
    }
}
