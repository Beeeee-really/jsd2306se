package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 睡眠阻塞
 * <p></p>Thread提供了一个静态方法:
 * <p>static void sleep(long ms)
 * <p>该方法可以让一个线程进入阻塞状态，超时后线程会回到RUNNABLE状态
 */
public class SleepDemo {
    public static void main(String[] args) {
//        System.out.println("程序开始了");
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("程序结束了");


        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        try {
            System.out.println("输入数字:");
            String line = bufferedReader.readLine();
            int time = Integer.parseInt(line);
            System.out.println(time);
            System.out.println("倒计时开始!");
            for (int i = time; i >= 0; i -= 1) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        System.out.println("输入数字:");

//        Scanner scan = new Scanner(System.in);
//        int time = scan.nextInt();
//        System.out.println("倒计时开始!");
//        for (int i = time; i >= 0; i -= 1) {
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
        System.out.println("倒计时结束了!");
    }
}
