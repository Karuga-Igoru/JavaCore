/*
 * Java Core. Homework #1
 *
 * @author Igor Kargapolov
 * @version 13.02.2022
 */
package Lesson1;
import java.util.Random;

public class Barrier {
    final int barrierType;
    final int barrierDifficulty;
    Random random = new Random();

    public Barrier(int barrierType, int barrierDifficulty) {
        this.barrierType = barrierType;
        this.barrierDifficulty = barrierDifficulty;
    }

    public int getBarrierType() {
        return barrierType;
    }

    public int getBarrierDifficulty() {
        return barrierDifficulty;
    }


    public boolean passingBarrier (Player player) {
        boolean result = false;
        switch (getBarrierType()) {
            case (1):
                result = getBarrierDifficulty() < (player.getSavingThrowReaction() + random.nextInt(20));
                break;
            case (2):
                result = getBarrierDifficulty() < (player.getSavingThrowWill() + random.nextInt(20));
                break;
            case (3):
                result = getBarrierDifficulty() < (player.getSavingThrowFortitude() + random.nextInt(20));
                break;
        }
        return result;
    }

}
