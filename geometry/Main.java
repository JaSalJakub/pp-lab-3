package geometry;
public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy ColoredCircle
        ColoredCircle coloredCircle1 = new ColoredCircle(5.0, "Czerwony");
        ColoredCircle coloredCircle2 = new ColoredCircle(3.0, "Niebieski");

        System.out.println("Właściwości kolorowych kół:");
        System.out.println("Circle:");
        System.out.println("Promień: " + coloredCircle1.getRadius());
        System.out.println("Kolor: " + coloredCircle1.getColor());
        System.out.println("Obwód: " + coloredCircle1.calculatePerimeter());
        System.out.println();

        System.out.println("Circle:");
        System.out.println("Promień: " + coloredCircle2.getRadius());
        System.out.println("Kolor: " + coloredCircle2.getColor());
        System.out.println("Obwód: " + coloredCircle2.calculatePerimeter());
        System.out.println();

        Square square = new Square(4.0);

        // Wyświetlanie właściwości kwadratu
        System.out.println("Squre:");
        System.out.println("Długość boku: " + square.getLength());
        System.out.println("Szerokość boku: " + square.getWidth());
        System.out.println("Pole kwadratu: " + square.calculateArea());
        System.out.println("Obwód kwadratu: " + square.calculatePerimeter());
        System.out.println();

        // Tworzenie obiektu klasy Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Wyświetlanie właściwości prostokąta
        System.out.println("Rectangle:");
        System.out.println("Długość: " + rectangle.getLength());
        System.out.println("Szerokość: " + rectangle.getWidth());
        System.out.println("Pole: " + rectangle.calculateArea());
        System.out.println("Obwód: " + rectangle.calculatePerimeter());
    }
}