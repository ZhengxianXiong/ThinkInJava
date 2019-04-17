package chap18.service;

import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {
    private static final String file = "f:\\text.txt";

    static void dispay() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        for (int i = 0; i < 7; i++) {
            System.out.println("value " + i + ":" + rf.readDouble());
        }
        System.out.println(rf.readUTF());
        rf.close();
    }

    public static void main(String[] args) {
        try {
            dispay();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
