package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {

    private File file;
    private Scanner reader;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws FileNotFoundException {
        int lines = 0;
        this.reader = new Scanner(this.file);
        while (reader.hasNextLine()){
            String string = reader.nextLine();
            lines++;
        }
        reader.close();
        return lines;
    }

    public int characters() throws FileNotFoundException {
        this.reader = new Scanner(this.file);
        int characters = 0;
        while (reader.hasNextLine()){
            String string = reader.nextLine();
            characters += string.length() + 1; // 1 - "\n"

        }
        reader.close();
        return characters;
    }
}
