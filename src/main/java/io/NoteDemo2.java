package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 完成简易记事本工具，需求与NoteDemo一致
 * 要求:
 * 使用PrintWriter完成，将用户输入的每一行字符串都要按行写入到文件note.txt中。
 * 自行使用4层流连接完成PrintWriter的创建
 */
public class NoteDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
//        PrintWriter pw = new PrintWriter(
//                new BufferedWriter(
//                        new OutputStreamWriter(
//                                new FileOutputStream("note.txt"),
//                                StandardCharsets.UTF_8
//                        )
//                )
//        );
        FileOutputStream fos = new FileOutputStream("pw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        /*
            PrintWriter构造器如果第一个参数为一个流，那么就支持再传入一个boolean值
            如果该值为true，则打开了自动行刷新操作
         */
        PrintWriter pw = new PrintWriter(bw,true);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请开始输入内容，单独输入exit退出");
        while(true){
            String line = scanner.nextLine();
            if("exit".equalsIgnoreCase(line)){
                break;
            }
            /*
                若打开了自动行刷新，每当我们使用PrintWriter的println方法写出一行字符串
                后就会自动flush一次。
             */
            pw.println(line);
        }
        System.out.println("再见");
        pw.close();



    }
}
