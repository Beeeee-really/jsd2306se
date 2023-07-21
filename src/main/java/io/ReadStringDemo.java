package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 从文件中读取数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("fos.txt");


        FileInputStream fis = new FileInputStream("fos.txt");
        //创建与文件等长的数组
        byte[] data = new byte[(int) file.length()];

        fis.read(data);

        String line = new String(data, StandardCharsets.UTF_8);

        System.out.println(line);
    }
}
