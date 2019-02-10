package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private File file;
    private Scanner reader;

    public WordInspection(File file) throws FileNotFoundException {
        this.file = file;
        this.reader = new Scanner(this.file);
    }

    public int wordCount() {
        int wordCount = 0;
        while (reader.hasNextLine()){
            String string = reader.nextLine();
            wordCount++;
        }
        reader.close();
        return wordCount;
    }

    public List<String> wordsContainingZ(){
        List<String> wordsContainingZ = new ArrayList<String>();

        while (reader.hasNextLine()){
            String string = reader.nextLine();
            if (string.contains("z")){
                wordsContainingZ.add(string);
            }
        }
        return wordsContainingZ;
    }

    public List<String> wordsEndingInL(){
        List<String> wordsEndingInL = new ArrayList<String>();

        while (reader.hasNextLine()){
            String string = reader.nextLine();
            if(string.charAt(string.length() - 1) == 'l'){
                wordsEndingInL.add(string);
            }
        }
        reader.close();
        return wordsEndingInL;
    }

    public List<String> palindromes(){
        List<String> palindromes = new ArrayList<String>();

        while (reader.hasNextLine()){
            String string = reader.nextLine();
            String reverseString = reverseString(string);
            if (string.equals(reverseString)) {
                palindromes.add(string);
            }
        }
        reader.close();
        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels(){
        List<String> wordsWhichContainAllVowels = new ArrayList<String>();


        while (reader.hasNextLine()) {
            String s = reader.nextLine();
            if(s.contains("a") && s.contains("e") && s.contains("i") && s.contains("o") && s.contains("u")
                    && s.contains("y") && s.contains("ä") && s.contains("ö")) {
                wordsWhichContainAllVowels.add(s);
            }
        }
        return wordsWhichContainAllVowels;
    }

    public String reverseString( String str){
        String reverseString = "";
        char ch;
        for(int i = str.length() - 1; i >= 0; i--){
            ch = str.charAt(i);
            reverseString += ch;
        }
        return reverseString;
    }
}
