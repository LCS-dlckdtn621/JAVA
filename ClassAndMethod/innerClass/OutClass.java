package innerClass;

public class OutClass {
    private final int num = 10;
    private static int sNum = 20;
    private final InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }

    class InClass{
        int iNum = 100;

        void inTest(){
            System.out.println("OutClass num = " + num +"(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum +"(외부 클래스의 스태틱 변수)");
            System.out.println("InClass num = " + num +"(내부 클래스의 인스턴스 변수)");
        }
    }

    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest(){
            System.out.println("InClass num = " + sInNum +"(내부 클래스의 스태틱 변수)");
            System.out.println("OutClass sNum = " + sNum +"(외부 클래스의 스태틱 변수)");
            System.out.println("InClass sNum = " + iNum +"(내부 클래스의 인스턴스 변수)");
        }
    }

    public static void inStaticTest(){
        System.out.println("InClass num = " + InStaticClass.sInNum +"(내부 클래스의 스태틱 변수)");
        System.out.println("OutClass sNum = " + sNum +"(외부 클래스의 스태틱 변수)");
    }

    public void usingClass(){
        inClass.inTest();
    }
}
