import java.io.File;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // Tạo folder mới:
//        File outputFolder = new File("src/output");
//        outputFolder.mkdir();
//
//        // tạo file mới trong folder
//        File file = new File("src/output/test.txt");
//        file.createNewFile();



        // Tạo folder output ở ngoài project
        File outputFolder = new File("output");
        outputFolder.mkdir();
        // Tạo file và folder trong output
        File file = new File("output/hello.txt");
        file.createNewFile();
        File folder = new File("output/subfolder");
        folder.mkdir();
        // Tạo file và folder trong folder subfolder:
        File folder2 = new File("output/subfolder/ouput1.txt");
        folder2.createNewFile();
        File folder3 = new File("output/subfolder/output1");
        folder3.mkdir();


        // Đổi tên folder:
        folder.renameTo(new File("output/subfolder1"));

        if(outputFolder.exists()) {
            outputFolder.delete();
        }

        System.out.println("Cấu trúc của cây thư mục là: ");
        displayDirTree(outputFolder);
    }

    private static void displayDirTree(File rootDir) {
        if(rootDir.isDirectory()) {
            System.out.println(rootDir.getName());
            File[] files = rootDir.listFiles();
            String prefix = "-";
            for(File file : files) {
                System.out.println(prefix + file.getName());
                if(file.isDirectory()) {
                    String prefix2 = "--";
                    File[] files2 = file.listFiles();
                    for (File file2: files2) {
                        System.out.println(prefix2 + file2.getName());
                    }
                }
            }
        } else {
            System.out.println("Đây không phải là thư mục");
        }
    }
}