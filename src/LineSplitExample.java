import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class LineSplitExample {
    public static void main(String[] args) throws IOException {
        var filename = "jerseys.txt";
        var studentJerseys = Paths.get(filename);
        var studentNames = new ArrayList<String>();
        var jerseyNumbers = new ArrayList<Integer>();
        var studentLines = Files.readAllLines(studentJerseys);
        //new style of for loop
        for (var line :  studentLines){
            var splitLine = line.split(",");
            studentNames.add(splitLine[0]);
            var jerseyNum = Integer.parseInt(splitLine[1]);
            jerseyNumbers.add(jerseyNum);
        }
        // old style of for loop
        for (int i = 0; i < studentNames.size(); i++){
            System.out.println("Stduent: " +studentNames.get(i)+ "   Jersey Numbers: " + jerseyNumbers.get(i)+"" );
        }
    }
}
