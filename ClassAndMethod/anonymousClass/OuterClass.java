package anonymousClass;

public class OuterClass {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){

        int num = 10;

        class MyRunnable implements Runnable{
            int localNum = 1000;
            @Override
            public void run() {

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + OuterClass.sNum + "(외부 클래스 static 변수)");
            }
        }
        return new MyRunnable();
    }

}
