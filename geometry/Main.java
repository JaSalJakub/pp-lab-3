package geometry;
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.0);
        circles[1] = new ColoredCircle(4.0, "Czerwony");
        circles[2] = new ColoredCircle(5.0, "Niebieski");

        for (Circle circle : circles) {
            System.out.println("Area: " + circle.calculateArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Color: " + coloredCircle.getColor());
            }
        }
    }
}