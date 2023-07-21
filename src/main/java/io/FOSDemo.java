package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JAVA IO
 * <p>IO:Input和Output 即:输入与输出
 * <p>其中输入用于读，输出用于写
 * <p>输入是从外界到我们写的程序的方向，是获取数据的
 * <p>输出是我们写的程序到外界的方向，是发送数据的
 *
 * <p></p>java.io.InputStream和OutputStream
 * <p>InputStream是一个抽象类，java中所有字节的输入流都继承他，他自定义了所有输入流都必须具备的读取字节的相关方法
 * <p>OutputStream也是抽象类，是所有字节输出流的超类，定义了写出都必须具备的相关方法
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        /*
            向当前项目下的文件写出数据
         */
        FileOutputStream fos = new FileOutputStream("./fos.dat");//文件不存在则创建

//        File file = new File("./fos.dat");
//        FileOutputStream fos = new FileOutputStream(file);

        fos.write(1);
        fos.write(2);
        System.out.println("写出完毕");
        fos.close();
    }
}
