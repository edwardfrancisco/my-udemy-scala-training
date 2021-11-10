package exercises

import scala.annotation.tailrec

object Recursion extends App {

   def stringConcatenate(isString: String, n: Int): String ={
     @tailrec
     def recHelper(x: Int, stringAccumulator: String): String =
       if (x <= 0) stringAccumulator
       else recHelper(x - 1, isString + stringAccumulator)

     recHelper(n, "")
   }

    println(stringConcatenate("x", 3))

    def isPrime(n: Int): Boolean = {
      def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
        if (!isStillPrime) false
        else if (t <= 1) true
        else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)

      isPrimeTailRec(n / 2, true)
    }

    println(isPrime(22))

}
