package inheritanceInterface;

public class CustomerTest {
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();

        ((Sell) customer).order();
        //재정의된 거 가져온다는 upcasting 꼭 유의하자!
        //downcasting은 상속한 class의 mehtod를 가져온다!
    }
}
