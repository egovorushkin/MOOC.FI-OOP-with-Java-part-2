package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;
    private List<Box> boxes;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.boxes = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {
        Box box = new Box(boxesVolume);
        int i = 0;
        for (Thing t : things) {
            this.boxes.add(new Box(this.boxesVolume));
            this.boxes.get(i).addThing(t);
            i++;
        }
        return this.boxes;
    }
}

