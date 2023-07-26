package thread;

/**
 * 有效地缩小同步范围可以在保证并发安全的前提下尽可能地提高并发性能56同步块7synchronized（同步监视器对象）{8需要多个线程同步执行的代码片段*}
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Thread t1 = new Thread("awa") {
            public void run() {
                shop.buy();
            }
        };

        Thread t2 = new Thread("qwq") {
            public void run() {
                shop.buy();
            }
        };

        t1.start();
        t2.start();

    }
}

class Shop {
    public void buy() {
        try {
            Thread t = Thread.currentThread();//获取buy方法的线程
            System.out.println(t.getName() + "正在挑衣服");
            Thread.sleep(5000);
            /*
                同步块使用时必须指定一个同步监视器对象
                必须是一个引用类的对象
                ...
             */
            synchronized (this) {
                System.out.println(t.getName() + "正在试衣服");
                Thread.sleep(5000);
            }

            System.out.println(t.getName() + ":结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

