package challenges.palindromeLinkedList;

import java.util.ArrayList;
import java.util.Objects;

// Insert Data Structure in Main.java and start the function with n1
//static ListNode n4 = new ListNode(1);
//static ListNode n3 = new ListNode(2, n4);
//static ListNode n2 = new ListNode(2, n3);
//static ListNode n1 = new ListNode(1, n2);

public class palindromeLinkedList {

    public static boolean isPalindrome(ListNode head){

        if(head.next == null) return true;
        ArrayList<Integer> values = new ArrayList<>();

        while(head != null){
            values.add(head.val);
            head = head.next;
        }

        for(int i = 0; i < values.size()/2; i++){
            if(!Objects.equals(values.get(i), values.get(values.size() - 1 - i))){
                return false;
            }
        }

        return true;
    }

}


