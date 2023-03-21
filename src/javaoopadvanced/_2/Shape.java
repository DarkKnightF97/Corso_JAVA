package javaoopadvanced._2;

public abstract class Shape {
    protected double height;
    protected double width;

    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public abstract double calculateArea();
}
