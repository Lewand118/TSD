object Task1 { 

    def main(args:Array[String])
    {
        println(toUpper("sdbfsabdfSDfsdfsA"))
        println(toUpper("asd"))
        println(toUpper("qwerty"))
    }
    
    def toUpper(s: String) : String = {
        val str_len : Int = s.length()
        if (str_len <= 4) {
          return s.toUpperCase()
        }
        else {
          return s.slice(0, str_len-4) + s.slice(str_len-4, str_len).toUpperCase()
        }
    }
}
