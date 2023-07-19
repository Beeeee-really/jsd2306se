package homework.day02;

public class Two {
    public static void main(String[] args) {
        String path = "http://localhost:8088/myweb/reg?name=zhangsan";
        String[] data = path.split("[?]");
        System.out.println(data[0]);
        System.out.println(data[1]);
    }
}
