package ra.bt3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ra/bt3/text.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter("src/ra/bt3/text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Đề bài: Viết chương trình đọc nội dung từ file text và hiển thị các từ trùng lặp trong file đó.\n");
        bufferedWriter.write("ád ádbasd áda sdas dsa sd áds sá\n");
        bufferedWriter.close();
        FileReader reader = new FileReader("src/ra/bt3/text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String ces = bufferedReader.readLine();
        String text = "";
        while (ces != null) {
            text += ces;
            ces = bufferedReader.readLine();
        }
        String[] texts = text.split(" ");
        List<String> str = new ArrayList<>();
        for (int i = 0; i < texts.length; i++) {
            int cout = 0;
            for (int j = 0; j < texts.length; j++) {
                if (texts[i].equals(texts[j])) {
                    cout++;
                    if (cout > 1) {
                        if (!str.contains(texts[i])) {
                            str.add(texts[i]);
                        }
                    }
                }
            }
        }
        System.out.println(str);
        bufferedReader.close();
    }
}
