package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 提高每次读写的效率，减少实际写的次数
 * 一组字节读写称为块读写
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./image2.png");
        FileOutputStream fos = new FileOutputStream("./image_cp2.png");

        int len;
        byte[] data = new byte[1024 * 10];//10kb
        long start = System.currentTimeMillis();
        while ((len = fis.read(data)) != -1) {
            fos.write(data, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕,用时:" + (end - start) + "ms");
        fis.close();
        fos.close();

    }
}
