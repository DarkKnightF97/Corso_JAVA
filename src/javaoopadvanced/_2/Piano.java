package javaoopadvanced._2;

public class Piano extends Instrument implements Playable{
    @Override
    public void play() {
        System.out.println("Playing the piano!");
    }
}
