/*
 * Java Core. Homework #1
 *
 * @author Igor Kargapolov
 * @version 13.02.2022
 */
package Lesson1;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        Player[] firstTeamPlayers = new Player[4];
        firstTeamPlayers[0] = new Player("Ivan", 5,6,7);
        firstTeamPlayers[1] = new Player("Alla", 5,6,6);
        firstTeamPlayers[2] = new Player("Venya", 4,7,5);
        firstTeamPlayers[3] = new Player("Anton", 6,4,4);

        Player[] secondTeamPlayers = new Player[4];
        secondTeamPlayers[0] = new Player("Fedor", 5,6,6);
        secondTeamPlayers[1] = new Player("Igor", 5,6,6);
        secondTeamPlayers[2] = new Player("Elena", 5,7,4);
        secondTeamPlayers[3] = new Player("Anna", 6,5,4);

        Team firstTeam = new Team("DontBotherMe", firstTeamPlayers);
        Team secondTeam = new Team("HeyJude", secondTeamPlayers);

        System.out.println("This Game has 3 types of barriers, which can be passed through special skills: \n" +
                "1) Bouncers - can be succeed by reaction;\n" +
                "2) Jar with spiders - only iron will can help you;\n" +
                "3) Queue at the clinic - fortitude and patience are keys for success\n" +
                "Only if all teammates pass the barrier, that team will receive a point.");
        System.out.println("Enter the quantity of barriers: ");

        Barrier[] race = new Barrier[sc.nextInt()];
        for (int i = 0; i < race.length; i++) {
            race[i] = new Barrier(random.nextInt(2) + 1, 10 + random.nextInt(20));
            for (Player firstTeamPlayer : firstTeamPlayers) {
                if (race[i].passingBarrier(firstTeamPlayer)) {
                    firstTeam.setTeamScore();
                }
            }
            for (Player secondTeamPlayer : secondTeamPlayers) {
                if (race[i].passingBarrier(secondTeamPlayer)) {
                    secondTeam.setTeamScore();
                }
            }
        }

        System.out.println("After series of " + race.length + " trials team "
                + firstTeam.getTeamName() + " get " + firstTeam.getTeamScore() + " points. " +
                "Team " + secondTeam.getTeamName() + " get " + secondTeam.getTeamScore() + " points");
        System.out.println("And winner is: " + ((firstTeam.getTeamScore() > secondTeam.getTeamScore()) ? firstTeam.getTeamName() : secondTeam.getTeamName()));
    }
}
