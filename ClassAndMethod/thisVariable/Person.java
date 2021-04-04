package thisVariable;

public class Person {

    String name;
    int age;

    public Person(){
        this("no name", 1);
        //여기서 instance가 생성이된 다음에서야 statement를 할 수 있다. -> 생성이 아직 완전치 않기 때문
        //this.name = "no name", this.age = 1 대신 이런 식으로 다른 constructor를 부르는게 훨씬 간결한 코드!
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person getPerson(){
        return this;
        //person자체의 address로 이해하면 된다 -> 참조값 자체로 이해
        //readme의 그림과 동일하게 출력을 해보면 동일 주소를 가르키게 된다
        //->person자체를 다시 할당하는 것과 동일하다 보면 된다
        //Person person = new Person()
        //System.out.println(person)
        //System.out.println(person.getPerson())
        //이 동일하다는 의미
    }
}
