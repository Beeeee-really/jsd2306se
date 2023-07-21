package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 提高每次读写的效率，减少实际写的次数
 * 一组字节读写称为块读写
 */
public class CopyDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("./image2.png");
        FileOutputStream fos = new FileOutputStream("./image_cp2.png");
        
    }
}
