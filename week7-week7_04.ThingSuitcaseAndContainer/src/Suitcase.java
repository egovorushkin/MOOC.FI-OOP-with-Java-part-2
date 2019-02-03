import java.util.ArrayList;

public class Suitcase {

    private int maxWeightLimit;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing){
        if(thing.getWeight() + this.totalWeight() > this.maxWeightLimit){

        }else
        this.things.add(thing);
    }


    public String toString() {
        int count = 0;
        for(Thing t : this.things){
            count += t.getWeight();
        }
        if(this.things.isEmpty()){
            return "empty (" + count +" kg)" ;
        }else if (this.things.size() == 1){
            return ("1 thing (" + this.totalWeight() + " kg)");
        }
            return things.size() + " things (" + count +" kg)" ;
    }

    public void printThings(){
        for (Thing t : this.things){
            System.out.println(t);
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for(Thing t : things){
            totalWeight += t.getWeight();
        }
        return totalWeight;
    }

    public Thing heaviestThing() {
        if (this.things.isEmpty()) {
            return null;
        }

            Thing newThing = this.things.get(0);
            for (Thing t : this.things) {
                if (newThing.getWeight() < t.getWeight()) {
                    newThing = t;
                }
            }
            return newThing;
        }
}
