package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前项目目录下创建一个文件
        File file = new File("./test.txt");
        /*
            boolean exists()
            如果当前file表示的文件和目录已经存在则返回true，否则返回false
         */
//        if (file.exists()){
//            System.out.println("该文件已存在");
//        }else{
//            file.createNewFile();
//            System.out.println("文件已创建");
//        }
        for (int i = 1; i <= 100; i += 1) {
            File file2 = new File("./" + i + ".txt");
            file2.createNewFile();
        }
    }
}
