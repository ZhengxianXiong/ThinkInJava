package chap18.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutPutShortCut {
    static String file = "FileOutputShortcut.out";

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(
                    new StringReader(
                            BufferedInputFile.read("f:\\test.txt")));
            PrintWriter out = new PrintWriter(file);
            String s;
            while ((s = in.readLine()) != null) {
                out.println(s);
            }
            out.close();
            in.close();
            System.out.println(BufferedInputFile.read(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
