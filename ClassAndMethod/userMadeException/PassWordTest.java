package userMadeException;

public class PassWordTest {

    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) throws PassWordException{
        if(password == null){
            throw new PassWordException("비밀번호는 null 일 수 없습니다");
        }
        else if(password.length()<5){
            throw new PassWordException("비밀번호는 5글자 이상이어야 합니다.");
        }
        else if(password.matches("[a-zA-Z]+")){
            throw new PassWordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
        }
        this.password = password;
    }

    public static void main(String[] args){
        PassWordTest passWordTest = new PassWordTest();
        String password = null;

        passWordTest.setPassword(password);
    }
}
