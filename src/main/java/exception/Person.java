package exception;

/**
 * 使用当前类测试异常地抛出
 */
public class Person {
    public int age;

    public void setAge(int age) throws IllegalAgeException {
        if (age <= 0 || age > 100) {
//            throw new RuntimeException("年龄超出了范围!");
            throw new IllegalAgeException("年龄超出范围");
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
