package collectionFrameWork.treeset;

import java.util.TreeSet;

public class MemberTreeSetTest {
    public static void main(String[] args){

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");
        Member duplicatedMemberHong = new Member(1004, "홍길동");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);
        memberTreeSet.addMember(memberHong);
        memberTreeSet.addMember(duplicatedMemberHong);

        memberTreeSet.showAllInfo();
    }
}
