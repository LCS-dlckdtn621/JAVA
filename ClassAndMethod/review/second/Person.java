package review.second;

public class Person {
    private String name;
    private int capacity;
    private String usage;
    private Transportaion transportation;

    public Person(String name, int capacity, String usage){
        this.name = name;
        this.capacity = capacity;
        this.usage = usage;
        this.transportation = new Transportaion(usage);
    }

    public void showResult(){
        int useMoney = transportation.returnFee();
        int presentMoney =  capacity-useMoney;
        System.out.println(this.name+"는 " + this.capacity+"원을 가지고 있었고, "+this.usage+"를 타면서 "
        +useMoney+"를 지불합니다. 남은 돈은 "+presentMoney+"입니다");
    }


}
