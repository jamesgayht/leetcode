package LeetcodePrac.LeetCode;
// package LeetcodePrac;

// import java.util.List;
// import java.util.TreeSet;

// public class Leetcode21 {
    
//     public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
  
//         ListNode tempListNode = new ListNode(0);  
//         ListNode currentNode = tempListNode;  

        

//         while(list1.next != null && list2.next != null) {
//             if(list1.val > list2.val) {
//                 currentNode.next = list2; 
//                 list2 = list2.next; 
//             } else {
//                 currentNode.next = list1; 
//                 list1 = list1.next; 
//             }
//         }

//         if(list1.next == null) {
//             currentNode.next = list2; 
//             list2 = list2.next;
//         }

//         if (list2.next == null) {
//             currentNode.next = list1; 
//             list1 = list1.next; 
//         }

//         return tempListNode.next; 
//     }

//     public class ListNode {
//         int val;
//         ListNode next;

//         ListNode() {
//         }

//         ListNode(int val) {
//             this.val = val;
//         }

//         ListNode(int val, ListNode next) {
//             this.val = val;
//             this.next = next;
//         }
//     }
// }
