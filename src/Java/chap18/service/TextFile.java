package chap18.service;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String> {
    public static String read(String filename) {
        StringBuffer sb = new StringBuffer();
        BufferedReader in = null;
        try {
            in = new BufferedReader(
                    new FileReader(
                            new File(filename).getAbsoluteFile()
                    )
            );
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static void write(String filename, String text) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(
                    new File(filename).getAbsoluteFile()
            );
            out.print(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public TextFile(String filename, String splitter) {
        super(Arrays.asList(read(filename).split(splitter)));
        if (get(0).equals("")) remove(0);
    }

    public TextFile(String filename) {
        this(filename, "\n");
    }

    public void write(String filename) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new File(filename).getAbsoluteFile());
            for (String item : this) {
                out.println(item);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public static void main(String[] args) {
        String filename = "f:\\test.txt";
        String file = read(filename);
        write("text.txt", file);
        TextFile text = new TextFile("text.txt");
        text.write("test.txt");
        TreeSet<String> words = new TreeSet<>(new TextFile("TextFile.java", "\\w+"));
        System.out.println(words.headSet("a"));
    }
}
