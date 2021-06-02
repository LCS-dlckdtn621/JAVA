package genericMethod;

public class Point <T, V>{

    T x;
    V y;

    public Point(T x, V y){
        this.x = x;
        this.y = y;
    }

    public T showXInfo(){
        return x;
    }

    public V showYInfo(){
        return y;
    }
}
