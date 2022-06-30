/*
 * Java Core. Homework #1
 *
 * @author Igor Kargapolov
 * @version 13.02.2022
 */
package Lesson1;

public class Team {
    final String teamName;
    private int teamScore;
    final Player[] player;

    public Team(String teamName, Player[] player) {
        this.teamName = teamName;
        this.teamScore = 0;
        this.player = player;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public Player[] getPlayer() {
        return player;
    }

    public void setTeamScore() {
        this.teamScore = teamScore + 1;
    }
}
