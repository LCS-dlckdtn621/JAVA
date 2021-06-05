package exceptionErrors;

class AutoCloseableTest {
    public static void main(String[] args){
        AutoCloseableObj autoCloseableObj = new AutoCloseableObj();

        try(autoCloseableObj){
            throw new Exception();
        }catch (Exception e){
            System.out.println("exception");
        }

        System.out.println("end");
    }
}
