package templatePattern;

public class ManualCar extends Car{

    @Override
    public void drive(){
        System.out.println("수동 주행을 합니다");
        System.out.println("사람이 방향을 바꿉니다");
    }

    @Override
    public void stop(){
        System.out.println("브레이크를 밟아서 멈춥니다");
    }
}
