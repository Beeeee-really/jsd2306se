package thread;

/**
 * StringBuilder和StringBufferStringBuilder不是并发安全的，StringBuffer是并发安全的
 */
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer();
//        StringBuilder sb = new StringBuilder();

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    sb.append("abc");
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    sb.append("def");
                }
            }
        };
        t1.start();
        t2.start();


        Thread.sleep(50);
        System.out.println(sb.length());
    }
}
