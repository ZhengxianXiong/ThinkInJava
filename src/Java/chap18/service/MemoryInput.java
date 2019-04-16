package chap18.service;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
    public static void main(String[] args) {
        try {
            StringReader in = new StringReader(BufferedInputFile.read("f:\\test.txt"));
            int c;
            while ((c = in.read()) != -1) {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
