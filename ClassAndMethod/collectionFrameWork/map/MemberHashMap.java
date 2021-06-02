package collectionFrameWork.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.showMemberIDInfo(), member);
    }

    public boolean removeMember(int memberId){

        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }
        System.out.println("no element");
        return false;
    }

    public void showAllMember(){
        for(Integer key : hashMap.keySet()){
            System.out.println(hashMap.get(key));
        }

//        Iterator<Integer> iter = hashMap.keySet().iterator();
//        while(iter.hasNext()){
//            System.out.println(hashMap.get(iter.next()));
//        }
    }
}
