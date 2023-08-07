package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

/**
 * 使用当前类测试反射机制
 */
@AutoRunClass
public class Person {

    private String name = "张三";
    private int age = 22;

    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @AutoRunMethod(4)
    public void sayHello(){
        System.out.println(name+":hello!");
    }
    @AutoRunMethod
    public void sayHi(){
        System.out.println(name+":Hi!");
    }
    public void doSome(){
        System.out.println(name+":做某事");
    }
    @AutoRunMethod(7)
    public void sleep(){
            System.out.println(name+":睡觉");
    }
    @AutoRunMethod
    public void watchTV(){
        System.out.println(name+":看电视");
    }
    public void study(){
        System.out.println(name+":在学习");
    }
    @AutoRunMethod
    public void playGame(){
        System.out.println(name+":玩游戏");
    }

    public void say(String info){
        System.out.println(name+":"+info);
    }
    public void say(String info,int count){
        for (int i = 0; i < count; i++) {
            System.out.println(name+":"+info);
        }

    }

    public void sing(){
        System.out.println(name+":在唱歌");
    }

    private void hehe(){
        System.out.println("我是Person的私有方法!");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
