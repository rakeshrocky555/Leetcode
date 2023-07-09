package Non_DP


class ListNode(_x: Int = 0, _next: ListNode = null) {
   var next: ListNode = _next
   var x: Int = _x
 }

object RemoveNthNode extends App {
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    var len = 0
    var node = head
    while(node != null){
      node = node.next
      len = len + 1
    }


    var i = 1
    def return_list(node: ListNode): ListNode = {
      node match {
        case null => null
        case element => {
          if(n == len && i == 1){
            i = i + 1
            return_list(element.next)
          }
          else if(i == (len-n)){
            new ListNode(element.x, if(element.next != null){
              i = i + 1
              return_list(element.next.next)
            }else{
              null
            })
          }
          else{
            i = i + 1
            new ListNode(element.x, return_list(element.next))
          }
        }
      }
    }

    //result
    return_list(head)

  }

  println(removeNthFromEnd(new ListNode(12, new ListNode(12, null)), 1))
}
