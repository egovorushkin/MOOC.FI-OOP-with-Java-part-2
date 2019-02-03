import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){
        System.out.println("Statements:\n" +
                "  add - adds a word pair to the dictionary\n" +
                "  translate - asks a word and prints its translation\n" +
                "  quit - quits the text user interface");
        String command;
        while(true){
            System.out.print("Statement: ");
            command = reader.nextLine();
            if(command.equals("quit")){
                System.out.println("Cheers!");
                break;
            }else if(command.equals("add")){
                add();
            }else if(command.equals("translate")){
                translate();
            }else
                System.out.println("Unknown statement");

        }
    }

    public void add(){
        String word, translation;
        System.out.print("In Finnish: ");
        word = reader.nextLine();
        System.out.print("Translation: ");
        translation = reader.nextLine();
        dictionary.add(word, translation);


    }

    public void translate(){
        String word;
        System.out.print("Give a word: ");
        word = reader.nextLine();
        System.out.println("Translation: " + dictionary.translate(word));
    }
}