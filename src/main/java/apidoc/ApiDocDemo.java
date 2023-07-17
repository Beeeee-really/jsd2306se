package apidoc;


public class ApiDocDemo {

    /**
     * 文档注释
     *

     * @see java.lang.String
     * @since JDK1.5
     */


    public static final String INFO = "hello";

    /**
     * 问候语
     * @param name 给定用户名
     * @return 返回
     */

    public String sayHello(String name) {
        return "hello" + name;
    }

}
