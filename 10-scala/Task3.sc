object Task3 {
    def NumofAppearance(text: String, str1: String, str2: String): Array[Int] = {
        var str1_ctr = 0;
        var str2_ctr = 0;
        var result = new Array[Int](2)
        for (i <- 0 to text.length-1) {
        if (i+str1.length <= text.length) {
            var tmp1 = text.substring(i, i+str1.length)
            if (tmp1.equals(str1)) {
                str1_ctr += 1
            }
        }
        if (i+str2.length <= text.length) {
            var tmp2 = text.substring(i, i+str2.length)
            if (tmp2.equals(str2)) {
                str2_ctr += 1
            }
        }
        
        
        }
       result(0) = str1_ctr
       result(1) = str2_ctr
    
      return result
    }
  
    def main(args: Array[String]): Unit = {
        var str1 = "abc"
        var str2 = "sds"
        var text = "dfjklgh abc sdfs sds sdfsdflksdf sadfsafd abc"
        var result = NumofAppearance(text, str1, str2)
        println(s"Number of appearance in \"${text}\" of '${str1}': ${result(0)}")
        println(s"Number of appearance in \"${text}\" of '${str2}': ${result(1)}")
        
    }
}
