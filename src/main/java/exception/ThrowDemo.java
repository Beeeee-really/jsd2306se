package exception;

/**
 * throw关键字，可以主动对外抛出一个异常
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(1000000);
        System.out.println("此人年龄:" + p.getAge());
    }
}
