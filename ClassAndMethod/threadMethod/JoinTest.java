package threadMethod;

public class JoinTest extends Thread{

    int start;
    int end;
    int total;

    public JoinTest(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){

        int i;
        for(i = start; i<=end; i++){
            total+=i;
        }

    }

    public static void main(String[] args){

        JoinTest joinTest1 = new JoinTest(1, 50);
        JoinTest joinTest2 = new JoinTest(51, 100);

        try {
            joinTest1.join();
            joinTest2.join();
            //main이 얘네를 기다리는 것
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int lastTotal = joinTest1.total+ joinTest2.total;
        //여기서 나오는건 main thread에 해당한다

        System.out.println("jt1.total = " + joinTest1.total);
        System.out.println("jt2.total = " + joinTest2.total);
        System.out.println("lastTotal = " + lastTotal);
    }
}
