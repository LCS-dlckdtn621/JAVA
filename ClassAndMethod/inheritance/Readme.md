- 업캐스팅의 경우에는 단순히 하위클래스가 상위클래스를 내포하고 있기 때문에 묵시적으로 가능

    - Customer vc = new VIPCustomer();
    - 이런식으로 하면 vc의 경우는 customer의 멤버변수 혹은 method만 사용할 수 있다
    - 변수 type이 customer에 해당한다.


![virtual method](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-05/img/mem.png)


    public class TestMethod {

        int num;
        
        void aaa() {
            System.out.println("aaa() 호출");
        }
        
        public static void main(String[] args) {
            
            TestMethod a1 = new TestMethod();
            a1.aaa();
            
            TestMethod a2 = new TestMethod();
            a2.aaa();
        }
    
    }

![메소드 위치 관련 내용](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-05)

