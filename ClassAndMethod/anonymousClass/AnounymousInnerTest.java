package anonymousClass;

public class AnounymousInnerTest {
    public static void main(String[] args){
        OuterClass outerClass = new OuterClass();
        Runnable runner = outerClass.getRunnable(100);

        runner.run();
    }
}
