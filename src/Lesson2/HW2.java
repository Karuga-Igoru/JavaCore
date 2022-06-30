/*
 * Java Core. Homework #2
 *
 * @author Igor Kargapolov
 * @version 17.02.2022
 */
package Lesson2;
import java.util.Scanner;
import java.util.Random;
public class HW2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Enter the size of array");
        String[][] tDArray = new String[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < tDArray.length; i++) {
            for (int j = 0; j < tDArray[i].length;j++) {
                tDArray[i][j] = String.valueOf(rnd.nextInt(1000));
            }
        }
        //tDArray[3][2] = "asd";   //uncomment this line to throw MyArrayDataException
        System.out.println("Array sum is: " + toSumArray(tDArray));


    }

    static int toSumArray(String[][] arrayOfStrings) {
        try {
            int reqLength = 4;
            if (arrayOfStrings.length != reqLength || arrayOfStrings[0].length != reqLength)
                throw new MyArraySizeException();
        }
        catch (MyArraySizeException e) {
            System.out.println(e);
            return 0;
        }
        int arraySum = 0;
        for (int i = 0; i < arrayOfStrings.length; i++) {
            for (int j = 0; j < arrayOfStrings[i].length; j++) {
                boolean numCheck = isNumber(arrayOfStrings[i][j]);
                try {
                    if (!numCheck) throw new MyArrayDataException();
                }
                catch (MyArrayDataException er) {
                    System.out.println(er + "[" + i + "][" + j + "]");
                    return 0;
                }

                arraySum += Integer.parseInt(arrayOfStrings[i][j]);
            }
        }
        return arraySum;
    }

    public static boolean isNumber(String string) {
        if (string == null || string.isEmpty()) return false;
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))) return false;
        }
        return true;
    }
}
