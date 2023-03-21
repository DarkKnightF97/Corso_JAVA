package javaoopadvanced._2;

public class Guitar extends Instrument implements Playable{
    @Override
    public void play() {
        System.out.println("Playing the guitar!");
    }
}
