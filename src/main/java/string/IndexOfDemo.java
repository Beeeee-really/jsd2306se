package string;

/**
 * int indexOf(String str)
 * <p>检索当前字符串中给定内容第一次出现的位置，如果当前字符串不包含指定内容则返回-1
 * <p>
 * <p>int lastIndexOf(String str)
 * <p>检索当前字符串中指定内容最后一次出现的位置，如果当前字符串不包含指定内容则返回-1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        String line = "thinking in java";
        int index = line.indexOf("in");
        System.out.println(index);
    }
}
