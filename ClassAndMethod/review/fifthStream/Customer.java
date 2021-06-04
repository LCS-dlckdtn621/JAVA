package review.fifthStream;

public class Customer {
    private final String name;
    private final int age;
    private final int cost;

    public Customer(String name, int age, int cost){
        this.name = name;
        this.age = age;
        this.cost = cost;
    }

    public String showCustomerName(){
        return this.name;
    }

    public int showCustomerAge(){
        return this.age;
    }

    public int showCustomerCost(){
        return this.cost;
    }
}
