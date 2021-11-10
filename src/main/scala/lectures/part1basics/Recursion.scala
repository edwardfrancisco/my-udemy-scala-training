package lectures.part1basics

object Recursion extends App{
  def Factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * Factorial(n-1)
  }

  println(Factorial(1))

  def anotherFactorial(n: Int): BigInt = {
    def facHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else facHelper(x - 1, x * accumulator) //Tail recursion

    facHelper(n, 1)
  }

  println(anotherFactorial(10000))
}
