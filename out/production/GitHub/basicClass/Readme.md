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

    ---------------------

        Exception in thread "main" java.lang.CloneNotSupportedException: basicClass.Student
              at java.base/java.lang.Object.clone(Native Method)
              at basicClass.Student.clone(Student.java:33)
              at basicClass.EqualsTest.main(EqualsTest.java:22)

- Clone을 하기 위해서는 cloneable implement는 해야지 ... 객체지향 위법원칙을 허용하는 거라 까다로을 


    public class StringTest {

        public static void main(String[] args) {
            String str1 = new String("abc");
            String str2 = new String("abc");
            
            System.out.println(str1 == str2);
            
            String str3 = "abc";
            String str4 = "abc";
            
            System.out.println(str3 == str4);
        }
    }

- 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 두 가지 방법


- 힙 메모리는 생성될때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐


- 한번 생성된 String은 불변(immutable)


- String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨 ( 메모리 낭비가 발생할 수도 )
    - concat을 하는 경우를 의미한다.
