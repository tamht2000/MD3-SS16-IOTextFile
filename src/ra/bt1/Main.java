package ra.bt1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "src/ra/bt1/text.txt";
        String fileContent = readFile(fileName);


        String[] words = fileContent.split("\\s+");

        int wordCount = words.length;
        System.out.println(Arrays.toString(words));

        System.out.println("Số lượng từ trong file: " + wordCount);
    }

    public static String readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        StringBuilder content = new StringBuilder();

        int c;
        while ((c = fileReader.read()) != -1) {
            content.append((char) c);
        }

        fileReader.close();
        return content.toString();
    }
}

