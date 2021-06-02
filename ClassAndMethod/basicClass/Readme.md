- 모든 class는 object class를 상속 받는다.

- instance 간 equals는 메모리 주소 위치 동일성이 판단기준인데 이는 재정의하면 된다.
          
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
        System.out.println(str1.hashCode());
        //override한 hashCode값 출력
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(std1));
        -> 실제 hashCode값 출력
        System.out.println(System.identityHashCode(std2));
