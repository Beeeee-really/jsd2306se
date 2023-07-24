package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * throw关键字，可以主动对外抛出一个异常
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(1000000);
        System.out.println("此人年龄:" + p.getAge());

    }

    class SubClass extends ThrowDemo {
        //        public void doSome() throws FileNotFoundException {
//
//        }
//        public void doSome(){}
//        public void doSome()throws IOException{}
//        public void doSome() throws IOException, AWTException {}
    }
}


