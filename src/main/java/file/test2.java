package file;

import java.io.File;

/**
 * 删除1.txt--100.txt
 */
public class test2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i += 1) {
            File file = new File("./" + i + ".txt");
            file.delete();
        }
        System.out.println("删除完毕");
    }
}
