package Lesson9;

import java.util.List;

public class Students implements Student{
    private String name;
    private List<Course> studentCourses;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    public void setStudentCourses(List<Course> studentCourses) { this.studentCourses = studentCourses;}

    public Students(String name) {
        this.name = name;
    }


}
