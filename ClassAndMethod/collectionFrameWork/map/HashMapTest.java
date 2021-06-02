package collectionFrameWork.map;

public class HashMapTest {
    public static void main(String[] args){
        MemberHashMap memberHashMap = new MemberHashMap();
        memberHashMap.addMember(new Member(1000, "홍길동"));
        memberHashMap.addMember(new Member(1001, "김유신"));
        memberHashMap.addMember(new Member(1001, "김유신"));
        memberHashMap.showAllMember();
    }
}
