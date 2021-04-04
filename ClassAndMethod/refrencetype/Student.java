package refrencetype;

public class Student {
    int studentId;
    String studentName;

    Subject korean;
    Subject math;

    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        this.korean = new Subject();
        this.math = new Subject();
        //대부분 생성자에서 다른 참조 객체를 할당한다
    }

    public void setKoreanSubject(String name, int score){
        this.korean.subjectName = name;
        this.korean.score = score;
    }

    public void setMathSubject(String name, int score){
        this.math.subjectName = name;
        this.math.score = score;
    }

    public void showScoreInfo(){
        int total = this.math.score+this.korean.score;
        System.out.println(studentName +"의 총점은 " + total +"입니다.");
    }
}
