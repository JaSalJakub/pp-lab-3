package geometry;
public class ColoredCircle extends Circle {
    public ColoredCircle(double radius, String color) {
        super(radius, color); 
    }

    public static void main(String[] args) {
        ColoredCircle coloredCircle = new ColoredCircle(5.0, "red");
        System.out.println("Radius: " + coloredCircle.getRadius());
        System.out.println("Color: " + coloredCircle.getColor());
        System.out.println("Perimeter: " + coloredCircle.calculatePerimeter());
    }
}
