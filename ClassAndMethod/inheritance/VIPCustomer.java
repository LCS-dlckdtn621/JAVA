package inheritance;

public class VIPCustomer extends Customer{

    private static int agentId = 1;
    private final double salesRatio;

    public VIPCustomer(){
//        super()
//        상위 class 생성자 호출할 기록이 없으면 그냥 이런식으로 default로 넣어준다
        this.agentId += 1;
        this.customerGrade="VIP";
        this.bonusRatio=0.05;
        this.salesRatio=0.1;
    }

    @Override
    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        price -= (int)(price *salesRatio);
        return price;
    }
}
