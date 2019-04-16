package chap18.service;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormattedMemoryInput {
    public static void main(String[] args) {
        DataInputStream in = null;
        try {
            in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("f:\\test.txt").getBytes()));
            while (true) {
                System.out.println((char) in.readByte());
            }
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
