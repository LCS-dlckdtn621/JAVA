package waitAndnotify;

import java.util.ArrayList;

class FastLibrary{
    public ArrayList<String> shelf = new ArrayList<>();

    public FastLibrary(){
        shelf.add("태백산맥1");
        shelf.add("태백산맥2");
        shelf.add("태백산맥3");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread thread = Thread.currentThread();

        while(shelf.size()==0){
            System.out.println(thread.getName()+" waiting start ");
            wait();
            System.out.println(thread.getName()+" waiting end");
        }

        String book = shelf.remove(0);
        System.out.println(thread.getName()+" : "+book+" lend ");
        return book;
    }

    public synchronized void returnBook(String book){
        Thread thread = Thread.currentThread();
        shelf.add(book);
        notifyAll();
        System.out.println(thread.getName()+" : "+book+" return ");
    }
}

class Student extends Thread{

    public Student(String name){
        super(name);
    }

    public void run(){

        try {
            String title = LibraryMain.fastLibrary.lendBook();
            if(title == null) return;
            sleep(5000);
            LibraryMain.fastLibrary.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {

    public static FastLibrary fastLibrary = new FastLibrary();

    public static void main(String[] args){
        Student std1 = new Student("std1");
        Student std2 = new Student("std2");
        Student std3 = new Student("std3");
        Student std4 = new Student("std4");
        Student std5 = new Student("std5");
        Student std6 = new Student("std6");

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();

    }
}
