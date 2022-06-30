/*
 * Java Core. Homework #3
 *
 * @author Igor Kargapolov
 * @version 22.02.2022
 */
package Lesson3.Task2;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<>();
        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(1);
        Apple apple3 = new Apple(1);
        Apple apple4 = new Apple(1);
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        apples.add(apple4);
        Box<Apple> appleBox1 = new Box<>(apples);

        ArrayList<Apple> apples1 = new ArrayList<>();
        Apple apple5 = new Apple(1);
        apples1.add(apple5);
        Box<Apple> appleBox2 = new Box<>(apples1);

        ArrayList<Orange> oranges = new ArrayList<>();
        Orange orange1 = new Orange(2);
        Orange orange2 = new Orange(2);
        Orange orange3 = new Orange(2);
        Orange orange4 = new Orange(2);
        oranges.add(orange1);
        oranges.add(orange2);
        oranges.add(orange3);
        oranges.add(orange4);
        Box<Orange> orangeBox1 = new Box<>(oranges);

        System.out.println("Is boxes mass are equal? " + appleBox1.compareBoxes(orangeBox1));

        System.out.println(appleBox1.getMass() + "lb of apples in first box with apples");
        System.out.println(appleBox2.getMass() + "lb of apples in second box with apples");
        appleBox1.toAnotherBox(appleBox2);
        System.out.println(appleBox1.getMass() + "lb of apples in second box after");

    }
}
