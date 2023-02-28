package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student s1 = new Student();
        s1.setName("Federico");
        s1.setAge(25);
        s1.setHeight(1.75);
        s1.setCourse("Corso java");
        s1.setGender("M");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getHeight());
        System.out.println(s1.getCourse());
        System.out.println(s1.getGender());
        System.out.println(Student.getCounter());
        System.out.println(s1.getName());
        System.out.println(Student.getCounter());


    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student s2 = new Student();
        s2.setName("Marco");
        s2.setAge(-13);
        s2.setHeight(1.76);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getHeight());
        System.out.println(Student.getCounter());
        System.out.println(s2.getName());
    }
}
