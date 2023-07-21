package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 向文件中写入小写字母
 */
public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("abc.txt");
        /*
            00000000 00000000 00000000 01100001
                                        ^^^^^^^
                                        写入文字
         */
        for (int i = 0; i < 26; i += 1) {
            fos.write(97 + i);
        }

        System.out.println("写出完毕");
        fos.close();
    }
}
