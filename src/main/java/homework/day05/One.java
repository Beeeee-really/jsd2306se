package homework.day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class One {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test_cp.txt");
        FileOutputStream fos = new FileOutputStream("test.txt");

        int d;
        while ((d = fis.read()) != -1) {
            fos.write(d);
        }
        System.out.println("复制完毕!");
        fis.close();
        fos.close();
    }
}
