package geometry;
public class ColoredCircle extends Circle {
    private String color;

    public ColoredCircle(double radius, String color) {
        super(radius, color); // Wywołujemy konstruktor klasy bazowej Circle z odpowiednimi parametrami
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}