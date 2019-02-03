
public class Main {

    public static void main(String[] args) {
        Suitcase suitcase = new Suitcase(20);
        suitcase.addThing(new Thing("Carrot", 2));
        suitcase.addThing(new Thing("Kaali", 8));
        suitcase.addThing(new Thing("Nauris", 4));

        Thing haviest = suitcase.heaviestThing();
        System.out.println(haviest);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for(int i = 0; i < 100; i++){
            Suitcase suitcase = new Suitcase(100);
            Thing thing = new Thing("Brick", i + 1);
            suitcase.addThing(thing);
            container.addSuitcase(suitcase);
        }
    }

}
