package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 像文件中写入字符串
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        /*
            1:如何将文字转换为一组字节
            2:转换出来的字节写入文件
         */
        FileOutputStream fos = new FileOutputStream("fos.txt");
        String line = "qwq qwq qwq";
        /*
            UTF-编码是Unicode的变长编码 包含全世界所有国家的文字
            中文  3字节
            英文与符号  1字节
         */
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        System.out.println("写出完毕");
        fos.close();
    }
}
