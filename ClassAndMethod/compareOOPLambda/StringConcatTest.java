package compareOOPLambda;

public class StringConcatTest {
    public static void main(String[] args){

        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString("Hello", "World");

        StringConcat stringConcat = (s1, s2) -> System.out.println(s1 + ", " + s2);
        stringConcat.makeString("Hello", "World");

        StringConcat stringConcat1 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {

            }
        };
    }
}
