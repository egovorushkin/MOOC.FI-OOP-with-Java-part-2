package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maxCapacity;
    private List<Thing> things;

    public Box(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing){
        if(this.getVolume() + thing.getVolume() <= this.maxCapacity){
            this.things.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Box{" +
                "maxCapacity=" + maxCapacity +
                ", things=" + things +
                '}';
    }

    @Override
    public int getVolume() {
        int currentVolume = 0;
        for(Thing t : this.things){
            currentVolume += t.getVolume();
        }
        return currentVolume;
    }
}