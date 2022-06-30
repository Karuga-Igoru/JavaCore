package Lesson3.Task1;

public class HW3 {
    public static void main(String[] args) {
        String[] intAr = {"5", "7", "3", "2", "1"};
        changeElements(intAr);
        for (String s : intAr) {
            System.out.print(s + " ");
        }
    }

    public static <T> T changeElements(Object[] obj) {
        Object tempObj = obj[1];
        obj[1] = obj[2];
        obj[2] = tempObj;
        return (T) obj;
    }
}
