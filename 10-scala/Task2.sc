object Task2 {
  def minSubarraySum(numbers: Array[Int], len:Int): Array[Int] = {
    var tmp_sum = 0
	var min_sub_array = Integer.MAX_VALUE
	var first, last = 0
    var result = new Array[Int](3)
    
		for (i <- 0 to numbers.length-1) {
		    tmp_sum = 0;
			for (j <- i to i+len-1) {
			    if (j < numbers.length) {
                    tmp_sum += numbers(j)
			    }
			}
			if (tmp_sum < min_sub_array) {
		        min_sub_array = tmp_sum
		        first = i
		        last = i+len-1
		    }
		}
		
		result(0) = first
		result(1) = last
		result(2) = min_sub_array
		
    result;
  }

  def main(): Unit = {
    val numbers = Array(3,45,6,2,4,3,6,7,32)
    val len = 4
    
    val result = minSubarraySum(numbers, len)
    println(s"Minumim sum of array[${result(0)}; ${result(1)}] is ${result(2)}")
  }
}