package file;

import java.io.File;

/**
 * java.io.File
 * <p>File的每一个实例用于表示硬盘上的一个文件或目录(实际表示的是一个路径)
 * <p>使用File可以:
 * <p>1:创建文件
 * <p>2:访问目录
 * <p>3:访问文件属性
 * <p></p>Flie不能访问文档数据
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./Demo.txt");//绝对路径 清晰明了:跨平台问题//"./"当前目录

        String name = file.getName();
        System.out.println(name);
        //获取file表示的文件长度，单位是字节
        long len = file.length();
        System.out.println(len + "个字节");

        boolean cr = file.canRead();
        //是否可读
        boolean cw = file.canWrite();
        //是否可写
        System.out.println("可读:" + cr);
        System.out.println("可写:" + cw);

        boolean ih = file.isHidden();
        System.out.println("隐藏:" + ih);
    }
}
