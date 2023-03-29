import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class task2 {

    // Создать файл file.txt. Если файл уже создан, ничего делать не надо. 
    // Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...

    public static void main(String[] args) throws IOException {
        Path path = Path.of("file.txt");
        String text = "TEXT";
 
        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8))
        {
            for (int i = 1; i < 100; i++) {
                bw.write(text);
            }
            System.out.println("Successfully written text to the file");
        }
        catch (IOException e) {
            e.printStackTrace();
    }
}
}
