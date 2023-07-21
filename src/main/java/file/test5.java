package file;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * 获取当前目录下名字以"."开始的文件
 */
public class test5 {
    public static void main(String[] args) {
        File file = new File(".");
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                return name.startsWith(".");
            }
        };
        File[] subs = file.listFiles(fileFilter);
        System.out.println(Arrays.toString(subs));
    }
}
