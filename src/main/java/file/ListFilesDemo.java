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


            /*
                File[] listFiles()
                将当前File对象表示的目录中所有子项返回。每一个子项用一个File对象表示
                最终以数组形式将它们返回。
             */
            File[] subs = file.listFiles();
            System.out.println(subs.length);
            for (File sub : subs) {
                System.out.println(sub.getName());
            }

        }
    }
}

