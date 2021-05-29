package staticType;

public class Company {

    private static Company company;

    Company(){

    }
    //constructor 로 생성자체를 못하게 막아버리는 것
    public static Company getInstance(){
        return company;
    }
    //만약 non-static method의 경우에는 instance를 생성하고 호출해야 하지만 static의 경우에는 instance를 생성할 필요가 없다.
}
