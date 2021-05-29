package inheritance;

public class Customer {

    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer(){
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
        System.out.println("customer 호출");
    }

    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint;
    }

}

