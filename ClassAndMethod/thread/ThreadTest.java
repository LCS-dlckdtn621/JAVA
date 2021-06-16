package thread;

class MyThread extends Thread{
    public void run(){
        int i;
        for(i = 1; i<=200; i++){
            System.out.println(i+"\t");
        }
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        int i;
        for(i = 1; i<=200; i++){
            System.out.println(i+"\t");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args){

        System.out.println(Thread.currentThread() + " start");

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        MyThread2 thread21 = new MyThread2();
        Thread thread = new Thread(thread21);

        System.out.println(Thread.currentThread()+" end ");
    }
}
