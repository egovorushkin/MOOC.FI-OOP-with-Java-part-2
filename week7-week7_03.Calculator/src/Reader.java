import java.util.Scanner;

public class Reader {

    private Scanner reader = new Scanner(System.in);

    public String readString(){
        String string = reader.nextLine();
        return string;
    }

    public int readInteger(){
        int number = Integer.parseInt(reader.nextLine());
        return number;
    }
}
