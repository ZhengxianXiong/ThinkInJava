package chap18.service;

import java.io.*;

public class StoringAndRecoveringData {
    public static void main(String[] args) {
        try {
            DataOutputStream out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("f:\\text.txt")));
            out.writeDouble(Math.PI);
            out.writeUTF("that was pi");
            out.writeDouble(1.41413);
            out.writeUTF("Square root of 2");
            out.close();
            DataInputStream in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("f:\\text.txt")));
            System.out.println(in.readDouble());
            System.out.println(in.readUTF());
            System.out.println(in.readDouble());
            System.out.println(in.readUTF());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
