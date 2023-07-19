package collection;

/**
 * 语法：
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};
        for (int i = 0; i < array.length; i += 1) {
            String e = array[i];
            System.out.println(e);
        }

        for (String e : array) {
            System.out.println(e);
        }
    }
}
