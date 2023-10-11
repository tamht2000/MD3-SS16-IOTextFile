package ra.bt4;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ra/bt4/text.txt");
        boolean check = file.createNewFile();
        FileWriter fileWriter = new FileWriter("src/ra/bt4/text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Em của ngày hôm qua\n");
        bufferedWriter.close();
        FileReader reader = new FileReader("src/ra/bt4/text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String ces = bufferedReader.readLine();
        String text = "";
        while (ces != null) {
            text += ces.toLowerCase();
            ces = bufferedReader.readLine();
        }
        String[] texts = text.split(" ");
        Arrays.sort(texts);
        System.out.println(Arrays.toString(texts));
    }
}
