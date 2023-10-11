import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class DemoBufferWritter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/hello.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String[] c = {"H", "e", "l", "l", "o"};
        writer.write(Arrays.toString(c));
    }
}
