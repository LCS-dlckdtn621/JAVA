package collectionFrameWork.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private final ArrayList<Member> arrayList;

    public MemberArrayList(){
        arrayList = new ArrayList<>();
    }

    public MemberArrayList(int size){
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberId){
        for(Member member : arrayList){
            if(member.showMemberIDInfo() == memberId){
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId+" 가 존재하지 않습니다.");
        return false;
    }

    public void showAllInfo(){
        for(Member member : arrayList){
            System.out.println(member.toString());
        }
        System.out.println();
    }

    public void showAllInfoIterator(){
        Iterator<Member> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member.toString());
        }
    }
}
