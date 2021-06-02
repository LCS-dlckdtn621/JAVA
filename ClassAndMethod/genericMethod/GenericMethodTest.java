package genericMethod;

public class GenericMethodTest {
    public static void main(String[] args){
        Point<Integer, Double> p1 = new Point<>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        double size = new Rectangle().rectangleSquare(p1, p2);
        System.out.println(size);
    }
}
