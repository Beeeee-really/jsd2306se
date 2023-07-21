package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /*
            将image.png复制
         */
        FileInputStream fis = new FileInputStream("./image.png");
        FileOutputStream fos = new FileOutputStream("./image_cp.png");
        int d;
        /*
            System.currentTimeMillis();
            返回一个long值
            自1970-01-01 00:00:00到表示的时间
         */
        long start = System.currentTimeMillis();
        while ((d = fis.read()) != -1) {
            fos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕,耗时:" + (end - start) + "ms");
        fos.close();
        fis.close();
    }
}
