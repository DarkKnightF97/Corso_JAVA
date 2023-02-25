package javaoop.exercises._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    public static int student;
    String courseName;
    int maxStudents;
    byte qualityRatingOutOf10;

    List<Student> students = new ArrayList<>();
    List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
    List<Integer> studentAges = Arrays.asList(23, 31, 38);

    String name;
    int age;

    public Course(String name, int age){
        this.name = name;
        this.age = age;
    }
    Course student1 = new Course(studentNames.get(0), studentAges.get(0));
    Course student2 = new Course(studentNames.get(1), studentAges.get(1));
    Course student3 = new Course(studentNames.get(2), studentAges.get(2));
}
