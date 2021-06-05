package subStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopyTest {
    public static void main(String[] args){
        long millisecond = 0;

        try(FileInputStream fis = new FileInputStream("input.txt");
            //느리니까 bufferedInputStream으로 해결하면 된다
            FileOutputStream fos = new FileOutputStream("outputTest.txt")){
                millisecond = System.currentTimeMillis();
                int i;
                while((i=fis.read())!=-1){
                    fos.write(i);
                }
                millisecond = System.currentTimeMillis() - millisecond;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(millisecond + "소요되었습니다.");
    }
}
