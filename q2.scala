object q2 {
    def main(args:Array[String]) = {

        println("Enter a number : ")
        var num = scala.io.StdIn.readInt()  
             
        def numCheck(n:Int) = n match {
            case x if(x < 0) => "Negative"
            case 0 => "Zero"
            case x if(x%2 == 0) => "Even"
            case _ => "Odd"
        }

        println(f"Number you entered is ${numCheck(num)}")
    }
}