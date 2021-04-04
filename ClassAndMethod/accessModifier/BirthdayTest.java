package accessModifier;

public class BirthdayTest {

    public static void main (String[] args){
        Birthday birthday = new Birthday();

        birthday.setYear(2019);
        birthday.setMonth(13);
        birthday.setDay(30);

        birthday.showDate();

        //만약 public/default로 할당된 경우
        //birthday.month = 100으로 해도 가능하다는 오류가 생긴다
        //잘못된 할당/잘못된 사용이 활성화 되는 것!
    }

}
