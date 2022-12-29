package Java.challenges.middleOfLinkedList;

import java.util.ArrayList;
import java.util.List;

public class middleOfLinkedList {

    public static ListNode middleNode(ListNode head){

        List<ListNode> list = new ArrayList<>();

        while(head != null){
            list.add(head);
            head = head.next;
        }

        return list.get(list.size()/2);
    }

}


