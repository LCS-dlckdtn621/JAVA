- method를 선언만 하는 것
    
    - {} 부분의 내용이 없는것!
    

- abstract 포함하면 abstract class로 바꾸자


    public abstract class Notebook extends Computer{
    
        @Override
        public void display(){
            System.out.println("Notebook Display");
        }
    }

    - 이렇게 하나만 override하는 경우에도 abstract는 필수

- abstact는 new 를 할 수 없다

    
    Computer computer = new Computer() {
    
    @Override
    public void display() {

        }

        @Override
        public void typing() {

        }
    };


- 이렇게 해야 그나마 가능(new 선언)
