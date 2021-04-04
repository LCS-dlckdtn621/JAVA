<H1>Static</H1>

- 여러 인스턴스가 공유하는 기준값에 해당하는 경우
  - ex) 학생마다 새로운 학번 생성
  
- 인스턴스가 생성될 때 만들어지는 변수가 아니고, 처음 프로그램이 메모리에 로딩될 때 메모리를 할당
   - memory/data/code 영역에 있어서 process/thread의 경우 memory에 할당된다.
   - data의 경우에는 상수/static/literal이 할당된다.
   - code의 경우에는 그냥 말 그래도 코드가 들어가게 된다.
   - Heap의 경우에는 동적할당으로서 instance 생성될 때마다 할당이 된다.
  
![memory구조](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-16/img/mem.png)

- 