package challenges.palindromeLinkedList;

import java.util.ArrayList;

public class palindromeLinkedList {

    public static boolean isPalindrome(ListNode head){

        if(head.next == null) return true;
        ArrayList<Integer> values = new ArrayList<>();

        while(head != null){
            values.add(head.val);
            head = head.next;
        }

        for(int i = 0; i < values.size()/2; i++){
            if(values.get(i) != values.get(values.size()-1-i)){
                return false;
            }
        }

        return true;
    }

}


