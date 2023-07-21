package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 完成简易的记事本工具
 *
 * <p>程序启动后，将用户在控制台上输入的每一行字符都写入到文件note.txt中
 * <p>当用户输入"exit"时程序退出
 */
public class NoteDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("note.txt");
        Scanner scan = new Scanner(System.in);
        String answer;
        while (true) {
            System.out.println("输入你想记录的内容(不可读取):(/exit退出)");
            answer = scan.nextLine();
            if ("/exit".equals(answer)) {
                System.out.println("bye!");
                break;
            } else {
                fos.write(answer.getBytes(StandardCharsets.UTF_8));
                System.out.println("保存成功!");
            }
        }
    }
}
