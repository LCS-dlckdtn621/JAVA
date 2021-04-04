<H1>Static</H1>

- 여러 인스턴스가 공유하는 기준값에 해당하는 경우
  - ex) 학생마다 새로운 학번 생성
  
- 인스턴스가 생성될 때 만들어지는 변수가 아니고, 처음 프로그램이 메모리에 로딩될 때 메모리를 할당
   - memory/data/code 영역에 있어서 process/thread의 경우 memory에 할당된다.
   - data의 경우에는 상수/static/literal이 할당된다.
   - code의 경우에는 그냥 말 그래도 코드가 들어가게 된다.
   - Heap의 경우에는 동적할당으로서 instance 생성될 때마다 할당이 된다.
  
![memory구조](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-16/img/mem.png)

- static method 에서 private으로 할당된 변수를 왜 사용하지 못할까?
    - private 으로 할당된 경우에 있어 static 은 이미 메모리에 올라간 상황이고 private은 instance 선언시에 할당이 된다 
      
      -> 그러므로 선후 관계상 맞지 않음
      
      -> But, 역의 경우는 충분히 가능.......당연히 static은 애초에 data단에 올라가기 때문
  
![scope](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-17/img/variable.png)

- class 내부 method 에서 여러번 사용되는 경우 member 변수로 활용하는 것이 좋다.
    
    -> 지역 변수의 경우 함수 생성시 호출되는 것이지만 클래스의 attribute 로서 활용되는 경우 당연히 멤버변수로 해야된다
  
<H3>Singleton</H3>
- 인스턴스가 단 **'한개만'** 생성되어야 하는 경우 적용되는 디자인 패턴
