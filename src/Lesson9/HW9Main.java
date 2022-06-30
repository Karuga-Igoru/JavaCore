package Lesson9;

import java.util.ArrayList;
import java.util.List;

public class HW9Main {

    public static void main(String[] args) {
        Courses physicsM = new Courses("Mechanic", "Lifshitz");
        Courses physicsT = new Courses("Thermodynamics", "Landau");
        Courses physicsN = new Courses("Nuclear","Curie");
        Courses chemistry = new Courses("Chemistry", "Nobel");
        Courses theoryOfGames = new Courses("Theory of games", "Nash");
        Courses notCourse = new Courses("Empty", "Empty");
        Courses math = new Courses("Mathematic", "Leibniz");

        Students student1 = new Students("Petrov");
        List<Course> student1Courses = new ArrayList<>();
        student1Courses.add(physicsM);
        student1Courses.add(chemistry);
        student1Courses.add(math);
        student1.setStudentCourses(student1Courses);

        Students student2 = new Students("Ivanov");
        List<Course> student2Courses = new ArrayList<>();
        student2Courses.add(physicsM);
        student2Courses.add(physicsN);
        student2Courses.add(physicsT);
        student2.setStudentCourses(student2Courses);

        Students student3 = new Students("Krupnov");
        List<Course> student3Courses = new ArrayList<>();
        student3Courses.add(theoryOfGames);
        student3Courses.add(math);
        student3Courses.add(physicsM);
        student3Courses.add(physicsT);
        student3.setStudentCourses(student3Courses);
    }
}
