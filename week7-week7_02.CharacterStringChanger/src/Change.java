public class Change {
    char fromCharacter;
    char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString){
        String replaceA = "";
        for(int i = 0; i < characterString.length(); i++){
            char character = characterString.charAt(i);
            if(character == this.fromCharacter){
                replaceA += this.toCharacter;
        }else
            replaceA += character;

        }
        return replaceA;
    }
}
