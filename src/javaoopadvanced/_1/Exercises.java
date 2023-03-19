package javaoopadvanced._1;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog dog = new Dog("Labrador", 58, 30);
        System.out.println("This is my dog : " + dog.getBreed());
        System.out.println(dog.getHeight());
        dog.setBreed("Alano");
        System.out.println("My new dog : " + dog.getBreed() + ", " + dog.getHeight() + " cm, " + dog.getWeight() + " Kg");
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Bird bird = new Bird(2.3, 1.5, 3);
        System.out.println("The wing span of an eagle is " + bird.getWingSpan());
        Fish fish = new Fish("Koi carp",70,10);
        System.out.println("The length of " + fish.getSpecies() + " is approximately : " + fish.getHeight() + " cm");
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog dog2 = new Dog("Chihuahua",20,1);
        Bird bird2 = new Bird(20, 12,15);
        Fish fish2 = new Fish("Carassius auratus",1,0.3);
        double maxSpeed = 0.0;
        String winner = "";
        if(dog2.runSpeedMetersPerSecond() > maxSpeed){
            maxSpeed = dog2.runSpeedMetersPerSecond();
            winner = "Dog";
        }
        if(bird2.flySpeedMetersPerSecond() > maxSpeed){
            maxSpeed =bird2.flySpeedMetersPerSecond();
            winner = "Bird";
        }
        if(fish2.swimSpeedMetersPerSecond() > maxSpeed){
            maxSpeed =fish2.swimSpeedMetersPerSecond();
            winner = "Fish";
        }
        System.out.println("The winner is " + winner);//è un Canarino

    }
    //Gli esempi sono un pò a caso come diceva anche Greg, giusto per farmi un idea e capire l'argomento
}
