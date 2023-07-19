package homework.day02;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        /*
        1.    [0-9]
        2.    [a-zA-Z0-9_]{3-15}+
         */
        Scanner scan = new Scanner(System.in);
        String answer = "";
        while (!(answer.matches("[a-zA-Z0-9_]{3,15}+"))) {
            System.out.println("输入用户名：");
            answer = scan.nextLine();
            if (!(answer.matches("[a-zA-Z0-9_]{3,15}+"))) {
                System.out.println("用户名错误！");
            }

        }
        answer = "";
        while (!(answer.matches("[0-9]+"))) {
            System.out.println("输入年龄:");
            answer = scan.next();
            if (!(answer.matches("[0-9]+"))) {
                System.out.println("年龄错误！");
            }

        }
        int age = Integer.parseInt(answer);
        if (age > 0 && age <= 100) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
