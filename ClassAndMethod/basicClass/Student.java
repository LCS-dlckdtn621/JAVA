package basicClass;

public class Student implements Cloneable{
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    public String toString(){
        return studentName+", "+studentNum;
    }

    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student std = (Student) obj;
            if(this.studentNum == std.studentNum){
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode(){
        return studentNum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
