package review.first;

public class Person {
    public int height;
    public int weight;
    public String sex;
    public String name;
    public int age;

    public void personInfo(){
        System.out.println("키가 "+this.height+" 이고 "+"몸무게가 "+this.weight+" 킬로인 "+this.sex+"이 있습니다. "+"이름은 " +
                this.name+" 이고 "+"나이는 "+this.age+"세 입니다");
    }
}
