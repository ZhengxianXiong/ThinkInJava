package chap18.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PracticeRead {
    public static void main(String[] args) {
        try {
            List<String> list = PracticeRead.read("F:\\test.txt");
            Iterator<String> it = (Iterator<String>) list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next().toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> read(String path) throws IOException {
        List<String> list = new LinkedList<>();
        BufferedReader in = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = in.readLine()) != null) {
            list.add(s);
        }
        in.close();
        return list;
    }
}
