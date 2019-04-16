package chap18.service;

import java.io.*;

public class TestEOF {
    public static void main(String[] args) {
        DataInputStream in = null;
        try {
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("f:\\test.txt")));
            while (in.available() != 0) {
                System.out.println((char) in.readByte());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
