import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/hello.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        // Đọc từng dòng
        String s = reader.readLine();

        while (s != null) {
            System.out.println(s);
            s = reader.readLine();
        }
        reader.close();
    }
}
