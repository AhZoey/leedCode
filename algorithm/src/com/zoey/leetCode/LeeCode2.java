package com.zoey.leetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeeCode2{
    //第二次
    //位次*对应10的倍数
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Integer sum1=0;
        Integer sum2=0;
        List<Integer> list1=new LinkedList<>();
        List<Integer> list2=new LinkedList<>();
        while (l1.next!=null){
            list1.add(l1.val);
        }
        while(l2.next!=null){
            list2.add(l2.val);
        }

        return null;
    }
}

/**
 *  第一次解析 模拟一个链表来解析
 */
 class LeeCode2Test1 {
    /**
     *执行用时： 5 ms , 在所有 Java 提交中击败了 21.55% 的用户
     * 内存消耗： 38.8 MB , 在所有 Java 提交中击败了 85.54% 的用户
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> result=new LinkedList<Integer>();
        int length=0;
        while (l1!=null||l2!=null){
            int val=(l1!=null?l1.val:0)+(l2!=null?l2.val:0);
            if(length==result.size()){
                if(val>=10){
                    result.add(val-10);
                    result.add(1);
                    length+=3;
                }else{
                    result.add(val);
                    length++;
                }
            }else{
                length=result.size();
                int amount=result.get(result.size()-1)+val;
                if(amount>=10){
                    result.remove(result.size()-1);
                    result.add(amount%10);
                    result.add(amount/10);
                    length+=3;
                }else{
                    result.remove(result.size()-1);
                    result.add(amount);
//                    length++;
                }
            }
            l1=l1==null?null:l1.next;
            l2=l2==null?null:l2.next;
//            length++;
        }
        ListNode first=new ListNode(result.get(0));
        ListNode node=getNode(first,result,1);
        return node;
    }
    public static ListNode getNode(ListNode parent,List<Integer> result,int i){
        if(result.size()-1>=i){
            ListNode node=new ListNode(result.get(i));
            parent.next=node;
            i++;
            getNode(node,result,i);
        }
        return parent;
    }
    public static void main(String[] args) {
//        ListNode l7=new ListNode(9);
//        ListNode l6=new ListNode(9,l7);
//        ListNode l5=new ListNode(9,l6);
//        ListNode l4=new ListNode(9,l5);
        ListNode l3=new ListNode(2);
        ListNode l2=new ListNode(3,l3);
        ListNode l1=new ListNode(8,l2);

//        ListNode n4=new ListNode(9);
        ListNode n3=new ListNode(1);
        ListNode n2=new ListNode(2,n3);
        ListNode n1=new ListNode(9,n2);
        ListNode node=addTwoNumbers(l1,n1);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
