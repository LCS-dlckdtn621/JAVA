package review.second;

public class Transportaion {
    private String usage;
    private int fee;
    

    public Transportaion(String usage){
        this.usage = usage;
        this.fee = this.determineWay();
    }
    
    private int determineWay(){
        if(this.usage.equals("Bus")){
            Bus bus = new Bus();
            return bus.returnFee();
        }
        Subway subway = new Subway();
        return subway.returnFee();
    }

    public int returnFee(){
        return this.fee;
    }
}
