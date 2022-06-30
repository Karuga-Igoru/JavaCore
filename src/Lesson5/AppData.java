package Lesson5;


import java.io.*;
import java.util.*;

public class AppData {
    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    static void writeTofile (AppData appData, File file) {
        Scanner sc = new Scanner(System.in);
        boolean toAppend = true;
        Integer toAppendInt;
        System.out.println("Do you want to rewrite file? yes - 1/n - 0");
        toAppendInt = sc.nextInt();
        if (toAppendInt == 1) toAppend = false;
        try (FileWriter out = new FileWriter(file, toAppend)) {
            int counter = 1;
            for(String s: appData.getHeader()) {
                for (int i = 0; i < s.length(); i++) {
                    out.write(s.charAt(i));
                }
                counter++;
                if (counter <= appData.getHeader().length) out.write(";");
            }
            out.write("\n");

            for(int[] s1: appData.getData()) {
                counter = 1;
                for (int s11: s1) {
                    out.write(String.valueOf(s11));
                    counter++;
                    if(counter <= s1.length) out.write(";");
                }
                out.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readFromFile (File file, AppData appData) throws FileNotFoundException, BadTypeOfData {

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[][] resultData = new int[records.size()][3];
        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).size();j++){
                if (isDigit(records.get(i).get(j))) {
                    resultData[i][j] = Integer.parseInt(records.get(i).get(j));
                }
                else throw new BadTypeOfData();
            }
        }
        appData.setData(resultData);
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

