package basicClass;

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString(){
        return title + ", " + author;
    }
}

class BookTest {
    public static void main(String[] args){

        Book book = new Book("데미안", "헤르만 헤세");

        String str = new String("Test");
        System.out.println(book);
        //toString 재정의 하면 memory 위치가 아닌 지정 String이 출력된다.
        System.out.println(str);
    }
}
