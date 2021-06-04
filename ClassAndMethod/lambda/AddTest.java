package lambda;

public class AddTest {
    public static void main(String[] args){
        MyNumber myNumber = (x, y) -> {
            if(x<y) {
                return y;
            }
            return x;
        };
        Add add = (x, y) -> x+y;
        System.out.println(add.add(1, 2));
        System.out.println(myNumber.getMax(10 ,24));
    }
}
