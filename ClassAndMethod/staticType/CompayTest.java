package staticType;

public class CompayTest {
    public static void main(String[] args) {
        Company company = Company.getInstance();
        //만약 non-static 이었으면
//    Company company2 = new Company();
//    company2.getInstance();
//    이런식으로 작성해야 하지만, 심지어 이 경우도 constructor 가 private 이라 접근이 안된다
//    결국 static 으로 처리해서 접근하는게 옳다!

        Company company2 = Company.getInstance();

        System.out.println(company);
        System.out.println(company2);
        //둘다 같은 heap 메모리 위치를 가르킨다.
    }


}
