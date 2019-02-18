package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> organisms;

    public Group() {
        this.organisms = new ArrayList<Movable>();
    }

    @Override
    public String toString() {
        String out = "";
        for (Movable m : this.organisms){
            out += m;
            out += "\n";
        }
        return out;
    }

    public void addToGroup(Movable movable){
        this.organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable m : this.organisms){
            m.move(dx, dy);
        }
    }
}
