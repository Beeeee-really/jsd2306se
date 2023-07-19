package homework.day02;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Person p = new Person("qwq", 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = scanner.next();
        if (p.getName().length() == 0) {
            System.out.println("姓名不能为空!");
        } else {
            p.setName(name);
        }
        System.out.println("请输入年龄:");
        int age = scanner.nextInt();
        if (p.getAge() < 0 && p.getAge() > 100) {
            System.out.println("年龄不合法!");
        } else {
            p.age = age;
        }

        System.out.println("姓名:" + p.name);
        System.out.println("年龄:" + p.age);
    }

    static class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}

