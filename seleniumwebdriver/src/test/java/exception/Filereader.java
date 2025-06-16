package exception;

import java.io.*;

public class Filereader {
    public static void main(String[] args) throws Exception {
        try {
            FileReader fr = new FileReader("file.txt");
        } catch (Exception e) {
           // System.out.println("File not found: " + e.getMessage());
            //System.out.println(e);
            throw new FileNotFoundException ("forced exception");
        }
    }
}
