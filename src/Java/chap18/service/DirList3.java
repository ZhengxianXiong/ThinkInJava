package chap18.service;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirList3 {
    public static void main(String[] args) {
        File file = new File(".");
        String[] list = file.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile("\\w+");

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        for (String str : list) {
            System.out.println(str);
        }
    }
}
