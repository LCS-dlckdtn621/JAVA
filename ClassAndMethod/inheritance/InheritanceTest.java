package inheritance;

public class InheritanceTest {
    public static void main(String[] args){
        Customer customer = new Customer();
        VIPCustomer vipCustomer = new VIPCustomer();

        Customer vc = new VIPCustomer();
        System.out.println(vc.calcPrice(10));

    }
}
