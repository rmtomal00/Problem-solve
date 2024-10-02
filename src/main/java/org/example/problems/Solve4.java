package org.example.problems;


public class Solve4 {

    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(9);
        for (int i = 0; i < 6; i++) {
            int[] val = {9,9,9,9,9,9};
            ListNode nd = head;
            while (nd.next != null) {
                nd = nd.next;
            }
            nd.next = new ListNode(val[i]);
        }
        ListNode head2 = new ListNode(9);
        for (int i = 0; i < 3; i++) {
            int[] val = {9,9,9};
            ListNode nd = head2;
            while (nd.next != null) {
                nd = nd.next;
            }
            nd.next = new ListNode(val[i]);
        }
        ListNode listNode = new Solution().addTwoNumbers(head, head2);
        while (listNode != null) {
            System.out.printf(String.format("%d ", listNode.val));
            listNode = listNode.next;
        }

    }
     public static class Solution {
        public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode n1 = l1;
            ListNode n2 = l2;
            ListNode result = new ListNode(0);
            ListNode tail = result;
            boolean flag = false;
            boolean flag2 = false;
            int carry = 0;
            while(n1.next != null || n2.next != null){
                int s1 = 0;
                int s2 = 0;
                ListNode temp = null;
                if (n1.next != null){
                    s1 = n1.val;
                    n1 = n1.next;
                } else if(!flag){
                    s1 = n1.val;
                    flag = true;
                }
                if (n2.next != null){
                    s2 = n2.val;
                    n2 = n2.next;
                } else if(!flag2){
                    s2 = n2.val;
                    flag2 = true;
                }
                int sum = s1 + s2 + carry;
                if (sum >= 10){
                    int exp = sum % 10;
                    temp = new ListNode(exp, null);
                    carry = (sum-exp) / 10;
                }else {
                    temp = new ListNode(sum, null);
                    carry = 0;
                }
                tail.next = temp;
                tail = tail.next;
            }
            int nn1 = 0;
            if(n1.val != 0 && !flag){
                nn1 = n1.val;
            }
            int nn2 = 0;
            if(n2.val != 0 && !flag2){
                nn2 = n2.val;
            }
            int sum = nn1 + nn2 + carry;
            if (sum >= 10){
                int exp = sum % 10;
                tail.next = new ListNode(exp, null);
                tail = tail.next;
                carry = (sum-exp) / 10;
            } else {
                ListNode temp = new ListNode(sum, null);
                carry = 0;
                tail.next = temp;
                tail = tail.next;
            }
            if (carry > 0){
                tail.next = new ListNode(carry, null);
                tail = tail.next;
            }
            return result.next;
        }
    }
}
