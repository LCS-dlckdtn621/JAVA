package generic;

public class GenericPrinter<T> {
    private T material;

    public GenericPrinter(T material) {
        this.material = material;
    }

    public T showMaterialInfo(){
        return material;
    }

    @Override
    public String toString(){
        return material.toString();
    }

}
