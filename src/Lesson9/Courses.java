package Lesson9;

public class Courses implements Course {
    private String courseName;
    private String teacherName;

    public Courses(String courseName, String teacherName) {
        this.courseName = courseName;
        this.teacherName = teacherName;
    }

    public Courses() {
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }
}
