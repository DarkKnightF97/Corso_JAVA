package javaoop.exercises._3;

public class Student {
    private String name;
    private int age;
    private String course;
    private double height;
    private String gender;


    private static int ageCounter = 0;
    private static int heightCounter = 0;

    private static int nameCounter = 0;


    public String getName() {
        nameCounter++;

        return name;
    }
    public void setName(String name) {
        if ( name.contains("a")){
            System.out.println("character " + "a"+ " present");
        }
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String courseJava){
        this.course = courseJava;
    }
    public double getHeight() {
        heightCounter++;
        return height;
    }
    public void setHeight(double height ){
        if ( height > 1.75){
            System.out.println("tall student");
        }
        this.height = height;
    }
    public int getAge(){
        ageCounter++;

        return age;
    }
    public void setAge(int age){
        if(age <0 ){
            System.out.println("ERROR");
        } else {
            this.age = age;
        }
    }
    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public static int getCounter(){
        return nameCounter;
    }
   /* public Student (String name, int age, String course, double height, String gender){
        this.name = name;
        this.age = age;
        this.course = course;
        this.height = height;
        this.gender = gender;
    }*/
}
