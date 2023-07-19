package homework.day02;

import java.util.Arrays;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        String path1 = "reg";//处理注册的路径
        String path2 = "login";//处理登录的路径
        /*
         * 程序启动后，输入上述两个地址后检查下面输出.
         * 分析并解决存在的问题，并写出错误原因:
         * 比较的不是路径
         *
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入地址:");
        String path = scanner.nextLine();
        String[] data = path.split("/");
        System.out.println(Arrays.toString(data));
        path = data[4];
        if (path != null) {
            if (path.equals(path1)) {
                System.out.println("处理注册!");
            } else if (path.equals(path2)) {
                System.out.println("处理登录!");
            } else {
                System.out.println("输入地址有误!");
            }
        }
    }
}
