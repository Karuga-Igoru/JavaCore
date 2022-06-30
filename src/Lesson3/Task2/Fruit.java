/*
 * Java Core. Homework #3
 *
 * @author Igor Kargapolov
 * @version 22.02.2022
 */
package Lesson3.Task2;

public class Fruit {
    private String typeOfFruit;
    private Integer weight;

    public Fruit(String typeOfFruit, Integer weight) {
        this.typeOfFruit = typeOfFruit;
        this.weight = weight;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    Integer getWeight() {
        return weight;
    }
}
