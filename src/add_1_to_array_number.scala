object Solution {
    def plusOne(digits: Array[Int]): Array[Int] = {
        var carry = 1
        var sum = 0
        for(i <- digits.length-1 to 0 by -1){
            sum = carry + digits(i)
            carry = (sum/10).toInt
            digits(i) = sum%10
        }
        if(carry == 1){
            var arr = Array.ofDim[Int](digits.length+1)
            for(i <- digits.length-1 to 1 by -1){
                arr(i) = digits(i-1)
            }
            arr(0) = 1
            arr
        }
        else{
            digits
        }
    }
}
