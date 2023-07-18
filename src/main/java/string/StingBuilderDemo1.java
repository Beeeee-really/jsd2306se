package string;

/**
 * 由于字符串不适合修改，因此java提供了一个专门用于修改字符串的工具类:StringBuilder
 * <p>
 *
 * @author Beeeee
 */
public class StingBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();//创建无参构造器
        int len = builder.length();
        System.out.println(len);

        builder = new StringBuilder("hello world!");
        len = builder.length();
        System.out.println(len);





        /*
            StringBuilder append(String str);
            将给定的内容加到字符串末尾，相当于"+"操作

            提供了若干重载，任何java类型都可以作为参数加入，用于与当前字符串连接
         */
        builder.append("hello java!");
        len = builder.length();
        System.out.println(len);
        String line = builder.toString();//将当前StringBuilder的内容以String形式返回
        System.out.println(line);





        /*
            StringBuilder replace(int start,int end,String str);
            将指定范围内的字符串替换为给定内容
            范围含头不含尾

            hello world!hello java!
                    V
            hello wor qwq qwq o java!
         */

        builder.replace(9, 16, " qwq qwq ");
        System.out.println(builder);




        /*
            StringBuilder delete(int start,int end);
            删除指定范围内的字符串

            hello wor qwq qwq o java!
                    V
            r qwq qwq o java!
         */
        builder.delete(0, 8);
        System.out.println(builder);




        /*
            StringBuilder insert(int offset,String str);
            将指定内容插入到指定位置

            r qwq qwq o java!
                    V
            qwq r qwq qwq o java!
         */
        builder.insert(0, "qwq ");
        System.out.println(builder);


        builder.insert(0, "1212")
                .delete(0, 2)
                .replace(3, 4, "qwq")
                .insert(7, "qwq");//可连续写
        System.out.println(builder);





        /*
            StringBuilder reverse();
            反转字符串
         */
        builder.reverse();
        System.out.println(builder);
    }
}
