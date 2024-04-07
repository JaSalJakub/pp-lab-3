package geometry;
public class ColoredCircle extends Circle {
    private String color;

    public ColoredCircle(double radius, String color) {
        super(radius, color); 
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
