import challenges.*;
import challenges.palindromeLinkedList.*;


public class Main {

//    To run any challenge:
//    1. ChallengeClass.function(input)
//    2. Print the challenge

    static ListNode n4 = new ListNode(1);
    static ListNode n3 = new ListNode(2, n4);
    static ListNode n2 = new ListNode(2, n3);
    static ListNode n1 = new ListNode(1, n2);


    public static void main(String[] args) {

        System.out.println(palindromeLinkedList.isPalindrome(n1));

    }
}