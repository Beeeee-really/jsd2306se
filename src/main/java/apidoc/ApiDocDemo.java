package apidoc;

/**
 * 文档注释

 * @see java.lang.String
 * @since JDK1.5
 */
public class ApiDocDemo {



    /**
     * 问候语
     */
    public static final String INFO = "hello";

    /**
     * 问候语
     * @param name 给定用户名
     * @return 含有问候语的字符串
     */

    public String sayHello(String name) {
        return "hello" + name;
    }

}
