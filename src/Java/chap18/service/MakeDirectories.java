package chap18.service;

import java.io.File;

public class MakeDirectories {
    private static void fileData(File f) {
        if (f.isFile()) {
            System.out.println("it is a file");
        } else if (f.isDirectory()) {
            System.out.println("it is a directory");
        }
    }

    public static void main(String[] args) {
        File old = new File("F:\\");
        fileData(old);
    }
}
