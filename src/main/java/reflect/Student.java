package reflect;

import reflect.annotations.AutoRunClass;

@AutoRunClass
public class Student {
//    @AutoRunClass
    private String name = "张三";
    private int age = 18;
    private char gender = '男';

//    @AutoRunClass
    public Student(){}

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void study(){
        System.out.println(name+":good good study,day day up!");
    }

//    @AutoRunClass
    public void sleep(){
        System.out.println(name+":睡个觉");
    }

//    @AutoRunClass
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
