package com.xj.Exercise;

/**
 * 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Q2 {
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        Q2_ListNode l1 = new Q2_ListNode(2);
        l1.next = new Q2_ListNode(8);
        l1.next.next = new Q2_ListNode(3);

        Q2_ListNode l2 = new Q2_ListNode(7);
        l2.next = new Q2_ListNode(2);
        l2.next.next = new Q2_ListNode(9);
        l2.next.next.next = new Q2_ListNode(4);

        q2.addTwoNumbers(l1, l2);
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public Q2_ListNode addTwoNumbers(Q2_ListNode l1, Q2_ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }

        Q2_ListNode rtn = new Q2_ListNode(0);
        Q2_ListNode temp_rtn = rtn;
        int carry = 0;//进位
        while(l1 != null || l2 != null){
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;

            int sum = a + b + carry;
            temp_rtn.next = new Q2_ListNode(sum % 10);
            carry = sum / 10;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            temp_rtn = temp_rtn.next;
        }

        if (carry > 0){
            temp_rtn.next = new Q2_ListNode(carry);
        }

        return rtn.next;
    }
}
