/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
        (list1, list2) match {
            case (l1, l2) if(l1 != null && l2 != null) => if(l1.x > l2.x){
                ListNode(l2.x, mergeTwoLists(l1, l2.next))
            }
            else{
                ListNode(l1.x, mergeTwoLists(l1.next, l2))
            }
            case (l1, l2) if(l1 == null && l2 == null) => null
            case (l1, l2) if(l1 == null && l2 != null) => ListNode(l2.x, mergeTwoLists(null, l2.next))
            case (l1, l2) if(l1 != null && l2 == null) => ListNode(l1.x, mergeTwoLists(l1.next, null))
            
        }
    }
}
