package innerClass;

public class OutClassTest {
    public static void main(String[] args){
        OutClass outClass = new OutClass();
        outClass.usingClass();

        OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
        inStaticClass.inTest();

        OutClass.inStaticTest();
    }
}
