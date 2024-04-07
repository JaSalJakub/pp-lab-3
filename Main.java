public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Point i inicjowanie jego wartości
        Point point = new Point(117.375, 127.133);

        // Wyświetlanie współrzędnych punktu
        System.out.println("Współrzędne punktu:");
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());
    }
}