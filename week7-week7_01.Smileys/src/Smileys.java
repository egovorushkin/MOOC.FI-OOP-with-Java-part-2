
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         //printWithSmileys("Arto");
         //printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

    private static void printSmileysLine(int length){
        for (int i=0; i < length; i++){
            System.out.print(":)");
        }
        System.out.println("");
    }

    private static String printMiddleLine(String characterString){
        if (characterString.length() % 2 == 1){
            return ":) " + characterString + "  :)";
        }
        return ":) " + characterString + " :)";
    }


    private static void printWithSmileys(String characterString) {
       String middleLine  = printMiddleLine(characterString);
       printSmileysLine(middleLine.length() / 2);
        System.out.println(middleLine);
        printSmileysLine(middleLine.length() / 2);;
    }
}
