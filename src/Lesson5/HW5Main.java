package Lesson5;
import java.io.*;
import java.util.Arrays;


public class HW5Main {

    public static void main(String[] args) throws IOException, BadTypeOfData {
        File fileCSV = new File("src/Lesson5/materials/hw5CSV.csv");
        File anotherFile = new File ("src/Lesson5/materials/testing.csv");
        AppData appData1 = new AppData();
        appData1.setHeader(new String[]{"Value1", "Value2", "Value3"});
        appData1.setData(new int[][]{{93, 55, 70}, {17, 63, 21}, {10, 22, 31}});
        AppData appData2 = new AppData();
        appData2.setHeader(new String[3]);
        appData2.setData(new int[3][3]);
        AppData.writeTofile(appData1, fileCSV);
        AppData.readFromFile(fileCSV, appData2);
        System.out.println(Arrays.toString(appData2.getHeader()));
        System.out.println(Arrays.deepToString(appData2.getData()));



    }
}
