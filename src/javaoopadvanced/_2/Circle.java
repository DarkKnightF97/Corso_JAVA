package javaoopadvanced._2;

public class Circle extends Shape{
    protected final double radius;

    public Circle(double height, double width) {
        super(height, width);
        this.radius = height / 2;
        //non ho capito bene il calcolo matematico che mi porta a impostare il raggio come metà dell'altezza, ma credo che funzioni
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((height / 2), 2);
    }
}
