package homework.day04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) throws IOException {
        String answer = "./";
        File file = new File(answer);
        while ((file.exists())) {
            System.out.println("输入文件名");
            Scanner scan = new Scanner(System.in);
            answer = scan.next();
            file = new File(answer);
            if ((file.exists())) {
                break;
            }else{
                System.out.println("文件已存在");
            }

        }
        file.createNewFile();
        /*
        //【在这里标注该句代码意义】
        Scanner scanner = new Scanner(System.in);

        //循环
        while(true){

        }

        //【在这里标注该句代码意义】
        String fileName = scanner.nextLine();

        //【在这里标注该句代码意义】
        File file = new File(fileName);

        //【在这里标注该句代码意义】
        System.out.println("文件创建完毕!");

        //【在这里标注该句代码意义】
        System.out.println("请输入文件名:");

        //【在这里标注该句代码意义】
        file.createNewFile();

        //【在这里标注该句代码意义】
        if(file.exists()){

        }else{

        }

        //【在这里标注该句代码意义】
        System.out.println("该文件已存在，请更换名字");

        //【在这里标注该句代码意义】
        break;
        */
    }
}
