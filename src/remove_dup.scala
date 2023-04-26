/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    var prev = 123856
    def deleteDuplicates(head: ListNode): ListNode = {
        if(head == null){
            prev = 123856
            null
        }
        else if(head.x != prev){
                prev = head.x
                ListNode(prev, deleteDuplicates(head.next))
        }
        else{
                deleteDuplicates(head.next)
        }
        
    }
}
