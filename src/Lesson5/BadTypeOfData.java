package Lesson5;

public class BadTypeOfData extends Exception{
    @Override
    public String toString(){
        return "File has wrong structure of data";
    }
}
