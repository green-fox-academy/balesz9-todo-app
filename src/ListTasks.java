import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTasks {

    public static void printOutTasks(){
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get("../assets/tasksEmpty.txt"));
        } catch (IOException e) {
            System.err.println("File does not exit!");
        }
        if (lines.size() != 0)
        for(int i = 0 ; i < lines.size(); i++){
            System.out.println((i+1)+" - "+lines.get(i));
        }
        else System.out.println("No todos for today! :)");

    }
}
