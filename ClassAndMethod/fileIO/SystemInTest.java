package fileIO;

import java.io.IOException;

class SystemInTest {
    public static void main(String[] args){

        System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요");
        int i;

        try {
            while((i = System.in.read()) != '\n'){
                System.out.println(i);
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
