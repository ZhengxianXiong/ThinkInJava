package chap13.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String[] args) {
        String url = "www.baidu.com1";
        String regex = "[w]{3}[.]{1}[a-zA-z]+[.]{1}[a-zA-Z]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(url);
        System.out.println(m.find());
    }
}
