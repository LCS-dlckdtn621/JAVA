1. implements Compare<add argument>

        @Override
        public int compareTo(Member member){
        //        if(member.showMemberIDInfo()<this.memberId){
        //            return 1;
        //        }
        //        if(this.memberId<member.showMemberIDInfo()){
        //            return -1;
        //        }
        //        return 0;
            return (this.memberId-member.showMemberIDInfo());
        }

2. implements Comparator<add argument>

       @Override
       public int compare(Member o1, Member o2) {
        return o1.showMemberIDInfo() -o2.showMemberIDInfo();
       }

        treeSet = new TreeSet<>(new Member());

- 이런식으로 특정 argument 기재가 필요해!
- 심지어 특정 default constructor 도 필요하다


    class MyCompare implements Comparator<String>{

        @Override
        public int compare(String s1, String s2) {
            return (s1.compareTo(s2)) *-1 ;
        }
    }

    public class ComparatorTest {

        public static void main(String[] args) {
            
            Set<String> set = new TreeSet<String>(new MyCompare());
            set.add("aaa");
            set.add("ccc");
            set.add("bbb");
                    
            System.out.println(set);
        }
    }

- 이런식으로 String의 경우 이미 지정된 compare가 존재한다
- 그러면 comparator로 변경할 필요가 존재....내림차순으로 변경을 한다던지
