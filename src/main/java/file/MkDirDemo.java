package file;

import java.io.File;

/**
 * 创建一个目录
 * <p></p>mkdir时linux的一个命令，也用于创建目录
 * <p>mk:make
 * <p>dir:directory
 */
public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下新建一个目录:demo
        File file = new File("./demo");
        if (!(file.exists())) {
            file.mkdir();
            System.out.println("目录已创建");
        } else {
            System.out.println("目录已存在");
        }
    }
}
