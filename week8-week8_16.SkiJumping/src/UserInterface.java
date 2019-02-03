import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Score score;
    public UserInterface() {
        reader = new Scanner(System.in);
        score = new Score();
    }

    public void start(){
        System.out.println("Kumpula ski jumping week"); //impl method?
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        String command  = "";
        while(true){
            System.out.print("  Participant name: ");
            command = reader.nextLine();
            if(command.isEmpty()){
                break;
            }else{
                score.addJumper(new Jumper(command));
            }
        }
        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();

        int i = 0;
        while (true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            command = reader.nextLine();
            System.out.println();
            if(command.equals("jump")){
                System.out.println("Round " + ++i);
                System.out.println();
                score.jumpingOrder();
                System.out.println("Results of round " + i);
                score.resultsOfRound();
            }else if (command.equals("quit")){
                break;
            }
        }
        System.out.println("Thanks!\n" +
                "\n" +
                "Tournament results:");
        score.tournamentResults();
    }




}
