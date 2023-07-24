package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 自动关闭特性
 * <p>JDK7之后java推出的特性，可以更简洁地完成诸如IO等在一场出处理机制的关闭动作
 */
public class AutoCloseDemo {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("fos.dat")
        ) {
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
