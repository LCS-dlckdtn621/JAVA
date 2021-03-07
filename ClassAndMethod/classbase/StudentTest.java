package classbase;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();
        //instance로서 클래스에서 나오는 하나의 객체
        studentLee.studentId = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        //instance
        studentKim.studentId = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();

    }
}
