package collectionFrameWork.map;

public class Member {
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

}
