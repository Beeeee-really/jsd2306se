package file;

import java.io.File;
import java.io.IOException;

/**
 * 在当前目录下新建一个目录
 * <p>在该目录下创建10个文件，名字test1.txt-test10.txt
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("./myDir");
        file.mkdirs();
        for (int i = 1; i <= 10; i += 1) {
//            File file1 = new File("./myDir/" + i +".txt");
            File file1 = new File(file, "test" + i + ".txt");
            if (file.exists()) {
                file1.createNewFile();
                System.out.println("文件已创建");
            }
        }
    }
}
