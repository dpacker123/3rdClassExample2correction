import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineSplitExample {
    public static void main(String[] args) throws IOException {
        var filename = "jerseys.txt";
        var studentJerseys = Paths.get(filename);
        var studentLines = Files.readAllLines(studentJerseys);
    }
}
