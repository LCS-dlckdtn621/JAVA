package collectionFrameWork.set;

import collectionFrameWork.set.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private final HashSet<Member> hashSet;

    public MemberHashSet(){
        hashSet = new HashSet<>();
    }

    public MemberHashSet(int size){
        hashSet = new HashSet<>(size);;
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){
        for(Member member : hashSet){
            if(member.showMemberIDInfo() == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId+" 가 존재하지 않습니다.");
        return false;
    }

    public void showAllInfo(){
        for(Member member : hashSet){
            System.out.println(member.toString());
        }
        System.out.println();
    }

    public void showAllInfoIterator(){
        Iterator<Member> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member.toString());
        }
    }
}
