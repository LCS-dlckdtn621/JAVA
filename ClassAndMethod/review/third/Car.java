package review.third;

public class Car {
    private static int serialNum = 10001;

    private int carNum;

    public Car(){
        this.carNum = serialNum++;
    }

    public int returnId(){
        return this.carNum;
    }
}
