package homework.day06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("note.txt");
        Scanner scan = new Scanner(System.in);
        String answer;
        while (true) {
            System.out.println("输入你想记录的内容:(exit退出)");
            answer = scan.nextLine();
            if ("exit".equals(answer)) {
                fos.close();
                break;
            } else {
                fos.write(answer.getBytes(StandardCharsets.UTF_8));
                System.out.println("保存成功!");
            }
        }
    }
}
