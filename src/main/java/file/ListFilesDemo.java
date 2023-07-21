package file;

import java.io.File;

/**
 * 获取一个目录中子项信息
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //查看当前目录中的所有子项
        File file = new File(".");
        /*
            boolean isFile
            返回true则说明
         */
        if (file.isDirectory()) {
            File[] subs = file.listFiles();
            System.out.println(subs.length);
            for (File sub : subs) {
                System.out.println(sub.getName());
            }

        }
    }
}

