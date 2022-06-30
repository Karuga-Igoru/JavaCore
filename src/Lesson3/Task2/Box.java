/*
 * Java Core. Homework #3
 *
 * @author Igor Kargapolov
 * @version 22.02.2022
 */
package Lesson3.Task2;

import java.util.ArrayList;
import java.util.Objects;

public class Box <T extends Fruit> {
    ArrayList<T> fruitsInside;

    public Box(ArrayList<T> fruitsInside) {
        this.fruitsInside = fruitsInside;
    }

    public ArrayList<T> getFruitsInside() {
        return fruitsInside;
    }

    public Integer getMass() {
        Integer totalMass = 0;
            for(T t: getFruitsInside()) {
                if (t != null) {
                    Integer weight = t.getWeight();
                    totalMass = weight + totalMass;
                }
            }
        return totalMass;
    }

    public Boolean compareBoxes(Box<? extends Fruit> box){
        return (Objects.equals(this.getMass(), box.getMass()));
    }

    public void toAnotherBox(Box<T> box) {

        for (T t : box.getFruitsInside()) {
            this.getFruitsInside().add(t);
        }
        box.getFruitsInside().clear();
    }









}
