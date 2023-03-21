package javaoopadvanced._2;

public class Car implements Movable{

    @Override
    public void moveForward() {
        System.out.println("La macchina va avanti");
    }

    @Override
    public void moveBackward() {
        System.out.println("La macchina va indietro");
    }
}
