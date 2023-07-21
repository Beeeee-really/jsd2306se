package file;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * 有条件的获取一个目录中的子集
 * <p></p>重载的listFiles方法:
 * <p>File[] listFiles(FileFilter filter)
 * <p>仅将当前目录File随想表示的目录中所有满足给定过滤器要求的子项返回
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()) {
            FileFilter fileFilter = pathname -> {
                String name = pathname.getName();
                return name.contains("a");
                /*
                    String提供的方法
                    boolean contains(String str)
                    判断当前字符串是否包含给定内容，包含则返回true
                 */
            };
            //            File[] subs = dir.listFiles(f -> f.getName().contains("a"));


            File[] subs = dir.listFiles(fileFilter);
            System.out.println(subs.length);
            System.out.println(Arrays.toString(subs));
        }
    }
}
