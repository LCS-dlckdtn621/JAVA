package accessModifier;

public class Birthday {

    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getMonth() {

        if(month<1 || 12<month){
            isValid = false;
            return month;
        }
        isValid = true;
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValid() {
        return isValid;
    }

//    public void setValid(boolean valid) {
//        isValid = valid;
//    } 이런 경우를 read-only라고 한다...내부 로직만을 위한 것이기 때문!!

    //get/set으로 설정

    public void showDate(){
        if(isValid){
            System.out.println(year + "년 "+month+"월 "+day+"일");
            return;
        }
        System.out.println("유효하지 않은 날짜 입니다.");
    }
}
