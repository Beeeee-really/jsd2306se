package file;

import java.io.File;

/**
 * 删除一个目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        File file1 = new File("demo/qwq/awa/qq");//相对路径中相对路径可以忽略不写，默认就是"./"
        if (file1.exists()) {
            file1.delete();
            System.out.println("目录已删除");
        } else {
            System.out.println("目录不存在");
        }

        File file2 = new File("demo/qwq/awa");//相对路径中相对路径可以忽略不写，默认就是"./"
        if (file2.exists()) {
            file2.delete();
            System.out.println("目录已删除");
        } else {
            System.out.println("目录不存在");
        }

        File file3 = new File("demo/qwq");//相对路径中相对路径可以忽略不写，默认就是"./"
        if (file3.exists()) {
            file3.delete();
            System.out.println("目录已删除");
        } else {
            System.out.println("目录不存在");
        }

        File file4 = new File("demo");//相对路径中相对路径可以忽略不写，默认就是"./"
        if (file4.exists()) {
            file4.delete();
            System.out.println("目录已删除");
        } else {
            System.out.println("目录不存在");
        }//只能一层一层删
    }
}
