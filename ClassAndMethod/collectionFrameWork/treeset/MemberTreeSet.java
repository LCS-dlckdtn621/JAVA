package collectionFrameWork.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private final TreeSet<Member> treeSet;

    public MemberTreeSet(){
        treeSet = new TreeSet<>();
    }

    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){
        for(Member member : treeSet){
            if(member.showMemberIDInfo() == memberId){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId+" 가 존재하지 않습니다.");
        return false;
    }

    public void showAllInfo(){
        for(Member member : treeSet){
            System.out.println(member.toString());
        }
        System.out.println();
    }

    public void showAllInfoIterator(){
        Iterator<Member> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member.toString());
        }
    }
}
