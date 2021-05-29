package ArrayList;

import Array.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("태백산맥", "조정래"));

        for(int i=0; i<library.size(); i++){
            Book book = library.get(i);
            System.out.println(book.showInfo());
        }
    }
}
