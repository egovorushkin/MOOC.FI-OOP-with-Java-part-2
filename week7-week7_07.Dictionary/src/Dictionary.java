import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String > dictionary;

    public Dictionary() {
        dictionary = new HashMap<String, String>();
    }

    public String translate(String word){
        if(this.dictionary.get(word) == null){
            return null;
        }
        return this.dictionary.get(word);
    }

    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }

    public int amountOfWords(){
        return this.dictionary.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> translationList = new ArrayList<String>();
        for(String k : this.dictionary.keySet()){
            String v = this.dictionary.get(k);

            String translStr = k + " = " + v;
            translationList.add(translStr);
        }
        return translationList;

    }
}