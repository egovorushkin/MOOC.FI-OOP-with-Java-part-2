import java.util.*;

public class Hand implements Comparable<Hand>{

    private List<Card> hands;

    public Hand() {
        hands = new ArrayList<Card>();
    }

    public void add(Card card){
        hands.add(card);
    }

    public void print(){
        for (Card c : hands){
            System.out.println(c);
        }
    }
    public void sort(){
        Collections.sort(hands);
    }

    @Override
    public int compareTo(Hand o) {
        int sum1 = 0;
        for(Card card : o.hands){
            sum1 += card.getValue();
        }

        int sum2 = 0;
        for(Card card : this.hands){
            sum2 += card.getValue();
        }
        return sum2 - sum1;

    }

    public void sortAgainstSuit(){
        SortAgainstSuitAndValue sortAgainst = new SortAgainstSuitAndValue();
        Collections.sort(this.hands, sortAgainst);
    }

}
