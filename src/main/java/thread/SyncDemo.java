package thread;

/**
 * 多线程并发安全问题
 * <p></p>多个线程并发操作同一临界资源，由于线程切换时机不确定,可能导致操作顺序出现混乱，从而导致不良后果
 * <p></p>临界资源:
 * <p>操作该资源的完成过程同一时刻只能有单一线程进行的资源称为临界资源
 */
public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread thread1 = new Thread() {
            public void run() {
                while (true) {
                    int beans = table.getBeans();
                    System.out.println(getName() + beans);
                }
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
                while (true) {
                    int beans = table.getBeans();
                    System.out.println(getName() + beans);
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}

class Table {
    private int beans = 20;

    public int getBeans() {
        if (beans == 0) {
            throw new RuntimeException("没有豆子了!");
        }
        return beans -= 1;
    }
}
