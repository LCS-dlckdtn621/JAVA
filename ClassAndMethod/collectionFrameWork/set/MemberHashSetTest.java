package collectionFrameWork.set;

import collectionFrameWork.set.Member;

public class MemberHashSetTest {
    public static void main(String[] args){
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");
        Member duplicatedMemberHong = new Member(1004, "홍길동");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);
        memberHashSet.addMember(memberHong);
        memberHashSet.addMember(duplicatedMemberHong);

        memberHashSet.showAllInfo();
    }
}
