package review.fifthStream;

import java.util.ArrayList;
import java.util.List;

public class CustomerStreamTest {
    public static void main(String[] args){
        Customer customerLee = new Customer("이순신", 40, 100);
        Customer customerKim = new Customer("김유신", 20, 100);
        Customer customerHong = new Customer("홍길동", 13, 50);

        List<Customer> cList = new ArrayList<>();
        cList.add(customerLee);
        cList.add(customerHong);
        cList.add(customerKim);

        cList.forEach(s->System.out.print(s.showCustomerName()+'\t'));
        System.out.println();
        cList.stream().filter(s->20<=s.showCustomerAge()).map(s->s.showCustomerName()).sorted().forEach(s->System.out.print(s+'\t'));
        System.out.println();
        System.out.println(cList.stream().mapToInt(s->s.showCustomerAge()).sum());
    }
}
