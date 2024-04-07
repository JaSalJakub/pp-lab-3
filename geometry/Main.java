package geometry;
public class Main {
    public static void main(String[] args) {
        Circle[] circles = {
            new Circle(5.0),
            new ColoredCircle(3.0, "Czerwony"),
            new Circle(7.5),
            new ColoredCircle(4.0, "Niebieski")
        };

        for (Circle circle : circles) {
            System.out.println("Pole koła: " + circle.calculateArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor koła: " + coloredCircle.getColor());
            }
        }

        Rectangle[] rectangles = {
            new Rectangle(4.0, 6.0),
            new Rectangle(3.0, 5.0)
        };

        for (Rectangle rectangle : rectangles) {
            System.out.println("Pole prostokąta: " + rectangle.calculateArea());
            System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
        }
    }
}