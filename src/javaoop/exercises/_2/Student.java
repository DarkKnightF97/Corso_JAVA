package javaoop.exercises._2;


public class Student {
    public String name;
    public int age;



    public Student(String name, int age){
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");

    }

    public Student(int age){
        this.name = "Unknown";
        this.age = age;
    }

    public Student(String name){
        this.name = name;
        int age = 0;
    }

    public Student(){
        this.name = "Unknown";
        this.age = 0;
    }

}
