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

        System.out.println(studentKim);
        //해당 instance에 할당된 값이 heap-memory의 주소에 해당한다
        //studentKim의 경우는 참조 변수, studentKim의 studentId와 같은 경우는 참조값에 해당한
        System.out.println(studentLee);

    }
}
