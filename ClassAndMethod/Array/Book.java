package Array;

public class Book {

    private String title;
    private String author;

    public Book(){

    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String showInfo(){
        return title+" 는 "+author+"가 집필하였습니다.";
    }

}
