package review.third;

public class Factory {

    private static Factory factory = new Factory();

    private Factory(){

    }

    public static Factory getInstance(){
        return factory;
    }

    public Car createCar(){
        return new Car();
    }
}
