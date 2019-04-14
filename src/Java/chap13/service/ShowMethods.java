package chap13.service;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
    public static void main(String[] args) {
        String className = "java.lang.String";
        Pattern p = Pattern.compile("\\w+\\.");
        Class<?> c;
        try {
            c = Class.forName(className);
            Method[] methods = c.getMethods();
            for (Method m : methods) {
                System.out.println(p.matcher(m.toString()).replaceAll(""));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
