import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
    private File file;

    public Printer(String fileName) {
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        String string = "";
        while (reader.hasNextLine()){
            String line = reader.nextLine();
            if(line.contains(word)){
                System.out.println(line);
            }
        }
        reader.close();
    }
}
