package chap18.service;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirList2 {
    public static FilenameFilter Filter(final String regex) {
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File("./");
        System.out.println(path.getAbsolutePath());
        String[] list = path.list(Filter("\\w+"));
        System.out.println(list.length);
        for (String str : list) {
            System.out.println(str);
        }
    }
}
