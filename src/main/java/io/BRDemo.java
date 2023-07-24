package io;

import java.io.*;

public class BRDemo {


    /**
     * BufferedReader 缓冲字符输入流
     * 特点:块读文本数据，可以按行读取字符串
     */

    public static void main(String[] args) throws IOException {
        //将当前源代码输出到控制台
        /*
            文件输入流(字节流，低级流)
            作用:从文件中读取字节
         */
        FileInputStream fis = new FileInputStream(
                "./src/main/java/io/BRDemo.java"
        );
        /*
            转换流(字符流，高级流)
            1:衔接字节与字符流
            2:将读取的字节转换为字符
         */
        InputStreamReader isr = new InputStreamReader(fis);
        /*
            缓冲字符输入流(字符流，高级流)
            1:块读字符数据(内部默认8192长的char数组)
            2:按行读取字符串
         */
        BufferedReader br = new BufferedReader(isr);
        /*
            String readLine()
            读取一行字符串。遇到换行符停止，将换行符之前的一行内容返回，并且返回的
            字符串中不含有最后的换行符.
            如果返回值为null则表达流读取到了末尾。
            如果读取到了空行(这一行只有一个换行符)此时方法返回一个空字符串


            需要注意:
            当我们第一次调用readLine()方法时，缓冲流会一次性读取8192个字符到其内部
            的char数组中(一次块读操作)，然后从数组最开始连续扫描字符，直到遇到换行符
            停止，并将之前的所有字符以一个字符串形式返回

         */
//        String line = br.readLine();
//        System.out.println(line);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }


        br.close();

    }
}







