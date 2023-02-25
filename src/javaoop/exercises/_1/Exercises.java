package javaoop.exercises._1;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise2();
        exercise3();
    }

    /**
     * 1: Create a new Class in this package
     *
     *    Call this class 'Course'
     *
     *    Inside add the following variables, using an appropriate type.
     *    courseName, maxStudents, qualityRatingOutOf10
     *
     *    On top of this choose 2 variables of your choice!
     */

    /**
     * 2: use the class called 'Student', add variables
     *    (class variables are called 'fields' or 'attributes')
     *    called 'name' and 'age'
     *
     *    Using the function below set the student name and ages
     *
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);

        // Use a for i loop
        for (int i = 0; i < studentNames.size(); i++) {
            createNewStudent(studentNames.get(i), studentAges.get(i));
            System.out.println(createNewStudent(studentNames.get(i), studentAges.get(i)));
        }


    }


    private static Student createNewStudent(String name, Integer age) {
        Student student = new Student();

        // Write your code here
        student.name = name;
        student.age = age;

        return student;
    }

    /*
     * 3: Finally lets edit our 'Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     *
     * Finalmente modifichiamo ancora una volta la nostra classe "Corso",
     *
     * Questa volta aggiungeremo un'altra variabile interna (campo o attributo) chiamata
     *    studenti. Sarà una List<Student> chiamata students
     *
     * Copia il codice qui sopra e aggiungi gli studenti dell'esercizio 2
     *
     * Bonus: utilizzando un ciclo appropriato a tua scelta trova l'età media dei nostri studenti.
     *
     * Suggerimento: usa un double per interrompere l'arrotondamento automatico dei numeri interi
     */


    private static void exercise3() {
        System.out.println("\nExercise 3:");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        // Write your code here
        double averageStudentAge = 0;
        for ( int i = 0; i < studentAges.size(); i++){
            averageStudentAge += studentAges.get(i);
        }
        double total = averageStudentAge / studentAges.size();
        System.out.println(total);
        }

    }

