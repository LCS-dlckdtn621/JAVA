package subStream;

import java.io.*;

public class InputStreamReaderTest {

    public static void main(String[] args){
        try(InputStreamReader ir = new InputStreamReader(new FileInputStream("reader.txt"))){
            int i;
            while((i=ir.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
