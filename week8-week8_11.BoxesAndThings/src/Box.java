import java.util.ArrayList;

public class Box implements ToBeStored {

    private double maximumWeight;
    private int amountOfThings;
    private ArrayList<ToBeStored> box;

    public Box(double maximumWeight) {
        this.box = new ArrayList<ToBeStored>();
        this.maximumWeight = maximumWeight;
        amountOfThings = 0;
    }

    public void add(ToBeStored thing){
        if(this.weight() + thing.weight() <= this.maximumWeight) {
            this.box.add(thing);
            amountOfThings++;
        }
    }

    @Override
    public double weight() {
        double currentWeight = 0;
        for(ToBeStored stored : this.box){
            currentWeight += stored.weight();
        }
        return currentWeight;
    }

    @Override
    public String toString() {
        return "Box: " + amountOfThings + " things, total weight " + weight() + " kg";
    }
}
