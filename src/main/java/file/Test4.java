package file;

import java.io.File;

/**
 * 将test3练习创建的myDir目录删除
 */
public class Test4 {
    public static void main(String[] args) {
        File file = new File("./myDir");
        if (file.isDirectory()) {
            File[] subs = file.listFiles();//获取该目录中的所有子项
            for (File sub : subs) {
                sub.delete();
            }
            file.delete();//当目录清空后将目录删除
        }

    }
}
