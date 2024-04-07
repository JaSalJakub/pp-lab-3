package geometry;
public class Main {
    public static void main(String[] args) {
        Point centerPoint = new Point(0, 0);
        Circle circle = new Circle(centerPoint, 15); 

        System.out.println("Center: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}