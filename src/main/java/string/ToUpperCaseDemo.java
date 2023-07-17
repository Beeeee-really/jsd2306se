package string;

/**
 * String toUpperCase()
 * <p>将当前字符串中的英文部分全部转换成大写
 * <p></p>String toLowerCase()
 * <p>将当前字符串中的英文部分转换为小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        System.out.println("q w q w q w q wQW QW QW".toUpperCase());

        System.out.println("qwq wqw qQWQ WQ WQ".toLowerCase());

        System.out.println("q wq wq wQ WQ WQ".equalsIgnoreCase("q wq wq wQ WQ WQ"));
    }
}
