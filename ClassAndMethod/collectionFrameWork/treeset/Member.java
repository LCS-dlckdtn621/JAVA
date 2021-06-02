package collectionFrameWork.treeset;

import java.util.Comparator;

public class Member implements Comparable<Member> {
    private final int memberId;
    private final String memberName;

    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int showMemberIDInfo(){
        return memberId;
    }

    public String showMemberNameInfo(){
        return memberName;
    }

    @Override
    public String toString(){
        return memberName + " 회원님의 아이디는 "+ memberId + "입니다.";
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member)obj;
            if(this.memberId == member.showMemberIDInfo()){
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return memberId;
    }

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
}
