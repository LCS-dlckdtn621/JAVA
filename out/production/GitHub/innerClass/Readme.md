    public class OutClass {
        private final int num = 10;
        private static int sNum = 20;

        class InClass{
            int iNum = 100;
            static int sNum = 500;
    
            void inTest(){
                    System.out.println("OutClass num = " + num +"(외부 클래스의 인스턴스 변수)");
                    System.out.println("OutClass sNum = " + sNum +"(외부 클래스의 스태틱 변수)");
                    System.out.println("InClass num = " + num +"(내부 클래스의 인스턴스 변수)");
                }
            }
    }

- 이렇게 사용하면 왜 오류가 날까?
    - static은 클래스 인스턴스 생성여하와 상관없이 불러오기 때문!


    static class InStaticClass{
        int iNum = 100;
        static int sInNUm = 200;
    
        void inTest(){
            System.out.println("OutClass num = " + num +"(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum +"(외부 클래스의 스태틱 변수)");
            System.out.println("InClass num = " + num +"(내부 클래스의 인스턴스 변수)");
        }
    }

- 외부 클래스 인스턴스 생성되기 전의 변수는 사용을 못하지 .... static!
