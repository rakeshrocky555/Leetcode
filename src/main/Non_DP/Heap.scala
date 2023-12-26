package Non_DP

import scala.math._
object Main extends App {
  val arr = Array(12, 1, 4, 3, 5, 6, 2, 13, 11, 10)
  var len = arr.length
  var heap_arr = Array.ofDim[Int](len)
  var i = 0
  var temp = 0
  var flag = true

  //max heap

  //insertion
  while(i < len){
    if(i == 0){
      heap_arr(i) = arr(i)
    }
    else{
      //adding the element to the last leaf
      heap_arr(i) = arr(i)
      //making sure of the heap property is satisfied
      var p = i
      flag = true
      //var temp = 0
      while((p > 0) && flag){
        //print(s"p value is $p and ${ceil(p/2).toInt - 1}")
        if(heap_arr(ceil(p.toDouble/2.toDouble).toInt - 1) < heap_arr(p)){
          //swap
          temp = heap_arr(ceil(p.toDouble/2.toDouble).toInt - 1)
          heap_arr(ceil(p.toDouble/2.toDouble).toInt - 1) = heap_arr(p)
          heap_arr(p) = temp
          //updating p value
          p = ceil(p.toDouble/2.toDouble).toInt - 1
        }
        else{
          flag = false
        }
      }
    }
    i += 1
  }

  //printing heapified array
  heap_arr.foreach(println)

  //deletion
  //placing the last leaf element at the root node
  heap_arr(0) = heap_arr(len - 1)
  //reducing the length by -1
  len -= 1
  i = 0

  flag = true
  //start the iteration to check if the heap property is maintained
  while(flag){
    var left = 2*i + 1
    var right = 2*i + 2
    if((left >= len) && (right >= len)){
      flag = false
    }
    else if(right >= len){
      if(heap_arr(i) > heap_arr(left)){
        flag = false
      }
      else{
        temp = heap_arr(left)
        heap_arr(left) = heap_arr(i)
        heap_arr(i) = temp
        flag = false
      }
    }
    else{
      if(heap_arr(i) > max(heap_arr(left), heap_arr(right))){
        flag = false
      }
      else{
        var max_index = heap_arr(i) match {
          case a if(heap_arr(left) > heap_arr(right)) => left
          case _ => right
        }
        //swapping the values
        temp = heap_arr(max_index)
        heap_arr(max_index) = heap_arr(i)
        heap_arr(i) = temp
        //updating the value of i
        i = max_index
      }
    }
  }

  //printing the array after deletion
  println("Post deletion")
  for(i <- 0 until len){
    println(heap_arr(i))
  }
}
