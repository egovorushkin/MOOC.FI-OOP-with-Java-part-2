import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcases;

    private int maxWeightLimit;
    private int currentWeight;

    public Container(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        currentWeight = 0;
        suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase){
        if( this.currentWeight + suitcase.totalWeight() > this.maxWeightLimit) {

        }else{
            this.suitcases.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight +" kg)" ;
    }

    public void printThings(){
        for(Suitcase s : this.suitcases){
            s.printThings();
        }
    }
}
