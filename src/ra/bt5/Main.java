package ra.bt5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ra/bt5/text.txt");
        boolean check = file.createNewFile();
        FileWriter fileWriter = new FileWriter("src/ra/bt5/text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Chúng ta không thuộc vể nhau, thế nhé!\n");
        bufferedWriter.close();
        FileReader reader = new FileReader("src/ra/bt5/text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String ces = bufferedReader.readLine();
        String text = "";
        while (ces != null) {
            text += ces.toLowerCase();
            ces = bufferedReader.readLine();
        }
        String[] texts = text.split(" ");
        String max = texts[0];
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i < texts.length; i++) {
            if (texts[i].length() > max.length()) {
                max = texts[i];
            }
        }
        for (int i = 1; i < texts.length; i++) {
            if (texts[i].length() == max.length()) {
                if (!stringList.contains(texts[i])) {
                    stringList.add(texts[i]);
                }
            }
        }
        System.out.println(stringList);
    }
}
