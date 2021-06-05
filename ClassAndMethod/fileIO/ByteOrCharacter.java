package fileIO;

import java.io.*;

public class ByteOrCharacter {
    public static void main(String[] args){

        try(FileInputStream fis = new FileInputStream("input.txt")){
            int i;
            while((i=fis.read())!=-1){
               System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i;
        try(FileInputStream fis = new FileInputStream("input2.txt")){
            byte[] bs = new byte[10];
            while((i=fis.read(bs, 1, 8 ))!=-1){
                //하나 건너 뛰고 몇개까지 가능한지 적어주는 것 어디부터 어디까지 버퍼에서 가져올거야? 이런 의미로 해석하자
                for(int j=0; j< i; j++){
                    System.out.print((char)bs[j]);
                }
                System.out.println(" : "+i+" 바이트 읽음");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileOutputStream fos = new FileOutputStream("output.txt")){
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileOutputStream fos = new FileOutputStream("output.txt", true)){
            byte[] bs = new byte[26];
            byte data = 65;
            for(int j = 0; j<bs.length; j++){
                bs[j] = data++;
            }
            fos.write(bs);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileReader fr = new FileReader("reader.txt")) {
            int j;
            while((j=fr.read())!=-1){
                System.out.print((char)j);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileWriter fw = new FileWriter("outputReader.txt")){
            fw.write("A");
            char[] buf = {'A', 'B', 'C', 'D'};
            fw.write(buf);
            fw.write("안녕하세요");
            fw.write("65");
            fw.write(65);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
