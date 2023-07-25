package homework.day06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class User {
    String name;
    String pwd;
    String nick;
    int age;

    public static void main(String[] args) throws IOException {
        User user = new User();
        System.out.println("name:");
        Scanner scan = new Scanner(System.in);
        user.name = scan.next();
        System.out.println("age:");
        user.age = scan.nextInt();
        System.out.println("nick:");
        user.nick = scan.next();
        System.out.println("password:");
        user.pwd = scan.next();

        FileOutputStream fos = new FileOutputStream(user.name + ".obj");
        fos.write(user.name.getBytes(StandardCharsets.UTF_8));
        fos.write(user.age);
        fos.write(user.nick.getBytes(StandardCharsets.UTF_8));
        fos.write(user.pwd.getBytes(StandardCharsets.UTF_8));
        fos.close();

    }
}
