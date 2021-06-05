package exceptionErrors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ThrowsException {
    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);

        return c;
    }

    public static void main(String[] args){
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "abc");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
