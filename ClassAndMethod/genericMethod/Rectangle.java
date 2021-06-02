package genericMethod;

public class Rectangle {

    public <T, V> double rectangleSquare(Point<T, V> p1, Point<T, V> p2){
        double left = ((Number)p1.showXInfo()).doubleValue();
        double right = ((Number)p2.showXInfo()).doubleValue();
        double bottom = ((Number)p1.showYInfo()).doubleValue();
        double top = ((Number)p2.showYInfo()).doubleValue();

        double height = top-bottom;
        double width = right-left;

        return height * width;
    }
}
