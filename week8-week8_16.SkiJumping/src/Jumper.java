import java.util.*;

public class Jumper implements Comparable<Jumper> {

    private String name;
    private int points;
    private Random random;
    private List<Integer> lengths = new ArrayList<Integer>();

    public Jumper(String name) {
        this.name = name;
        points = 0;

    }

    public String getName() {
        return name;
    }

    public int getPoints(){
        return points;
    }

    @Override
    public String toString() {
        return name + " (" + points + " points)";
    }

    public int jump(){
        random = new Random();
        int lenght = 60 + random.nextInt(120 - 60 + 1);
        lengths.add(lenght);
        this.points += lenght;
        return lenght;
    }

    public List<Integer> judgeVotes(){
        List<Integer> points = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int point = 10 + random.nextInt(20 - 10 + 1);
            points.add(point);
        }
        return points;

    }
    public int removeMinMaxValueAndSum(List<Integer> list){ ;
        int sum = 0;

        Collections.sort(list);

        list.remove(0);
        list.remove(list.size() - 1);

        for(Integer i : list){
            sum += i;
        }

        this.points += sum;

        return sum;
    }

    public void printLengths(){
        String str = "";
        for (int i = 0; i < lengths.size() - 1;  i++){
            System.out.print(lengths.get(i) + " m, ");
        }
        System.out.println(lengths.get(lengths.size()-1) + " m");
    }


    @Override
    public int compareTo(Jumper o) {
        return this.points - o.getPoints();
    }
}
