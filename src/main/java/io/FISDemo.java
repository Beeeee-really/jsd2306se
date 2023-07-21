package io;


import java.io.FileInputStream;
import java.io.IOException;

/**
 * 使用文件输入流从文件读取字节
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        /*
            将当前文件目录下的文件中的字节读取出来
         */
        FileInputStream fis = new FileInputStream("fos.dat");
        int d = fis.read();
        System.out.println(d);

        d = fis.read();
        System.out.println(d);

        d = fis.read();
        System.out.println(d);


    }
}
