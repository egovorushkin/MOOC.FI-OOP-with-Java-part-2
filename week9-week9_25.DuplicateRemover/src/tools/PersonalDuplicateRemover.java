package tools;

import javax.naming.InsufficientResourcesException;
import java.util.*;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> removers;
    private int count = 0;

    public PersonalDuplicateRemover() {
        this.removers = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {

        if(!this.removers.contains(characterString)){
            this.removers.add(characterString);

        }else
            this.count++;

    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.count;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() { ;

        return this.removers;
    }

    @Override
    public void empty() {
        this.removers.removeAll(removers);
        this.count = 0;
    }
}
