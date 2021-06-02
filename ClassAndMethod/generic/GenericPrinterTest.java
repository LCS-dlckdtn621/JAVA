package generic;

public class GenericPrinterTest {
    public static void main(String[] args){

        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>(new Powder());
        System.out.println(powderGenericPrinter.showMaterialInfo());
        //재료가 Plastic인 경우!
    }
}
