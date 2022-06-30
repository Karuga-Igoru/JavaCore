/*
 * Java Core. Homework #2
 *
 * @author Igor Kargapolov
 * @version 17.02.2022
 */
package Lesson2;

public class MyArraySizeException extends Exception{

    @Override
    public String toString(){
        return "MyArraySizeException. Array size must be [4][4]";
    }

}
