package constructor;

public class StudentTest {

    public static void main(String[] args){

        Student studentLee = new Student(123456, "Kim", 3);

        System.out.println(studentLee.showStudentInfo());
    }
}
