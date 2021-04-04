package staticType;

public class EmployeeTest {

    public static void main(String[] args){
        Employee employeeLee = new Employee("이순신", "리서치");
        System.out.println(Employee.serialNum);
        //instance와 상관없이 사용할 수 있다는 특징...왜냐하면 이미 메모리에 올라가는 순간 할당이 되기 때문
    }
}
