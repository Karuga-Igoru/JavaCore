/*
 * Java Core. Homework #1
 *
 * @author Igor Kargapolov
 * @version 13.02.2022
 */
package Lesson1;

public class Player {
    final String playerName;
    final int savingThrowReaction;
    final int savingThrowWill;
    final int savingThrowFortitude;
    private boolean onDistance;

    public Player(String playerName,
                  int savingThrowReaction, int savingThrowWill,
                  int savingThrowFortitude) {
        this.playerName = playerName;
        this.savingThrowReaction = savingThrowReaction;
        this.savingThrowWill = savingThrowWill;
        this.savingThrowFortitude = savingThrowFortitude;
        this.onDistance = true;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getSavingThrowReaction() {
        return savingThrowReaction;
    }

    public int getSavingThrowWill() {
        return savingThrowWill;
    }

    public int getSavingThrowFortitude() {
        return savingThrowFortitude;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }
}
