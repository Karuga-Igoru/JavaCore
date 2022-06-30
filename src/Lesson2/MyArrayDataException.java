/*
 * Java Core. Homework #2
 *
 * @author Igor Kargapolov
 * @version 17.02.2022
 */
package Lesson2;

public class MyArrayDataException extends Exception{
    @Override
    public String toString(){
        return "MyArrayDataException. This element cannot be converted: ";
    }
}
