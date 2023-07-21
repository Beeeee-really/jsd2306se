package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 将文件中的所有字节读取出来
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        int d;
//        while (true) {
//            d = fis.read();
//            if (d == -1) {
//                break;
//            }
//            System.out.print("\t" + (char) d);
//        }

        while ((d = fis.read()) != -1) {
            System.out.print("\t" + (char) d);
        }
        fis.close();
    }
}
