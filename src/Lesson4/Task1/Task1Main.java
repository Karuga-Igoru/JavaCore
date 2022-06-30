/*
 * Java Core. Homework #4
 *
 * @author Igor Kargapolov
 * @version 24.02.2022
 */
package Lesson4.Task1;
import java.util.*;


public class Task1Main {

    public static void main(String[] args) {
        String[] names = {"Anton", "Anton", "Alina", "Ivan", "Katya",
                "Alla", "Tanya", "Ivan", "Fedor", "Ingvar", "Tanya"};
        System.out.println(findUniqueNames(names));
        for (String s: findUniqueNames(names)) {
            int value = 0;
            for (String s1: names) {
                if (s.equals(s1)) {
                    value++;
                }
            }
            System.out.println(s + " " + value);
        }
    }

    static Set<String> findUniqueNames(String[] nameArray) {
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.addAll(Arrays.asList(nameArray));
        return uniqueNames;
    }
}
