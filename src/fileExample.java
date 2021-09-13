import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class fileExample {
    public static void main(String[] args) throws IOException {
        var filename = "students.txt";
        var studentFile = Paths.get(filename);
        var allStudents = Files.readString(studentFile);
        String[] separatedNames = allStudents.split("\n");
        // now lets show the user
        System.out.println("Here are the studetns in your class:");
        for (var studentName : separatedNames) {
            System.out.println(studentName);
        }
    }
}