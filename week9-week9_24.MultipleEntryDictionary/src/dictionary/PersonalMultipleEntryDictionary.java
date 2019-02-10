package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if(!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, new HashSet<String>());
        }

        Set<String> translate = this.dictionary.get(word);
        translate.add(entry);
//        this.dictionary.get(word).add(entry);

    }

    @Override
    public Set<String> translate(String word) {
        Set<String> translate =  new HashSet<String>();
            if (this.dictionary.containsKey(word)){
                translate = this.dictionary.get(word);
            }else if (!this.dictionary.containsKey(word))
                return null;
        return translate;
    }

    @Override
    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
