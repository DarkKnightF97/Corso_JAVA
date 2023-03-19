package javaoopadvanced._1;

public class Bird extends Animal{
    private double wingSpan;

    public Bird(double wingSpan, double height, double weight) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public double flySpeedMetersPerSecond(){
        return getWingSpan() * 4;
    }
}
