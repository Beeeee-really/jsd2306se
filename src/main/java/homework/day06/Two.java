package homework.day06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Two {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File dir = new File(".");

        File[] subs = dir.listFiles((f) -> f.getName().endsWith(".obj"));
        for (int i = 0; i < subs.length; i++) {
            File sub = subs[i];
            FileInputStream fis = new FileInputStream(sub);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            if (obj instanceof User) {
                User user = (User) obj;
                System.out.println(user);
            }
            fis.close();
            ois.close();
        }

    }
}
