package constructor;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    public Student(){
        System.out.println("student 생성");
    }

    public Student(int studentNumber, String studentName, int grade){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.grade = grade;
    }
    //만약 constructur가 존재한다면 default생성자는 코드를 작성해야 반영이 된다!
    //default생성자는 생성자가 하나도 없을 때만 결국 할당이 되는 것

    public String showStudentInfo(){

        int i;
        //이 경우는 지역 변수로서 멤버변수와 달리 객체가 만들어질 때 초기화 되지 않아서 return value로서 받지 못한다.

        return studentName + "학생의 학번은 " + studentNumber + " 이고, " + grade +"학년 입니다.";
//        return studentName + "학생의 학번은 " + studentNumber + " 이고, " + grade +"학년 입니다."+i;
//        오류가 발생하게 된다
    }

}
