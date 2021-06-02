package stringClassTest;

public class StringBuilderTest {
    public static void main(String[] args){
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        //or StringBuffer도 가능
        System.out.println(System.identityHashCode(buffer));
        buffer.append(android);
        System.out.println(System.identityHashCode(buffer));
        //위치가 계속 똑같네!
        System.out.println(buffer.toString());
    }
}
