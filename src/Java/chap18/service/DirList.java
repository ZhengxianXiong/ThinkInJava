package chap18.service;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
    public static void main(String[] args) {
        File path = new File("D:\\StudySpace\\Think_In_Java\\src\\Java\\chap18\\service");

        String[] list;
        list = path.list(new DirFilter("D.*\\.java"));
        System.out.println(list.length);
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String str : list) {
            System.out.println(str);
        }
    }
}

class DirFilter implements FilenameFilter {
    private Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}