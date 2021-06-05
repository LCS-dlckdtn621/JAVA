package exceptionErrors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileExceptionHandling {
    public static void main(String[] args){

        try(FileInputStream fis = new FileInputStream("a.txt")){

        } catch(FileNotFoundException e){

        } catch(IOException e){

        }

    }
}
