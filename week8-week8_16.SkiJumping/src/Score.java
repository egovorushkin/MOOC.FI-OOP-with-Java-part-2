import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Score {
    private List<Jumper> jumpers;
    private Random random = new Random();;

    public Score() {
        jumpers = new ArrayList<Jumper>();

    }

    public void addJumper(Jumper jumper){
        jumpers.add(jumper);
    }

    public void jumpingOrder(){
        System.out.println("Jumping order: ");
        int count = 1;
        Collections.sort(jumpers);
        for (Jumper j : jumpers){
            System.out.println("  " + count++ + ". " + j);
        }
        System.out.println("");
    }

    public void resultsOfRound() {
        List<Integer> points;
        for (Jumper j : jumpers) {
            System.out.println("  " + j.getName());
            System.out.println("    length: " + j.jump());
            points = j.judgeVotes();
            System.out.println("    judge votes: " + points);
            j.removeMinMaxValueAndSum(points);
        }
        System.out.println("");
    }

    public void tournamentResults(){
        System.out.println("Position    Name");
        int i = 1;
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        for (Jumper j : jumpers){
            System.out.println(i++ + "           " + j);
            System.out.print("            jump lengths: ");
            j.printLengths();
        }
    }
}
