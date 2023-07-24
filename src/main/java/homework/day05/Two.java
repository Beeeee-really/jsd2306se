package homework.day05;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        File file = new File(".");
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                return name.contains("s");
            }
        };
        File[] subs = file.listFiles(fileFilter);
        System.out.println(Arrays.toString(subs));
    }
}
