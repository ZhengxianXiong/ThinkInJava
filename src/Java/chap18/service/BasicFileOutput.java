package chap18.service;

import java.io.*;

public class BasicFileOutput {
    static String file = "BasicFileOutput.out";

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("f://test.txt")));
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            int lineCount = 1;
            String s;
            while ((s = in.readLine()) != null) {
                out.print(lineCount++ + ":" + s);
            }
            out.close();
            in.close();
            System.out.println(BufferedInputFile.read(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
