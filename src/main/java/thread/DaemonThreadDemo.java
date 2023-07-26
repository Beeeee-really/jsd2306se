package thread;

/**
 * 守护线程
 * <p></p>守护线程是通过用户线程调用的setDaemon(true)设置而来的，县城默认创建出来的用户线程守护线程与用户线程的区别在于进程的结束
 * <p></p>进程结束:
 * <p>当一个进程中的所有用户线程都结束时，进程就会结束，此时会杀死所有还在运行的守护线程
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("qwq");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("awa");
                System.out.println("ψ(._. )>");

            }
        };

        Thread jack = new Thread() {
            public void run() {
                while (true) {
                    System.out.println("UwU");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        rose.start();
        jack.setDaemon(true);
        jack.start();
    }
}































