import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.        
        SkiTounamentSim contest = new SkiTounamentSim();
        Scanner reader = new Scanner(System.in);
        
        
        contest.start(reader);
        contest.startTournament(reader);
        
    }
}
