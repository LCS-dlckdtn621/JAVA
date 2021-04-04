package staticType;

public class Employee {

    public static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(String employeeName, String department){
        serialNum++;
        this.employeeId = serialNum;
        //사번을 각자 가질 수 있도록 한다
        this.employeeName = employeeName;
        this.department = department;
    }


}
