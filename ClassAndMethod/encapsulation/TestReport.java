package encapsulation;

public class TestReport {
    public static void main(String[] args){
        MakeReport report = new MakeReport();
        String builder = report.getReport();
        //굳이 client가 참조하지 않아도 되는걸 public으로 만들어서 접근하게 할 필요는 없다!
        System.out.println(builder);
    }
}
