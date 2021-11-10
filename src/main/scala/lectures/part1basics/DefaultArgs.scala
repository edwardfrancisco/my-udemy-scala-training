package lectures.part1basics

object DefaultArgs extends App {
  def tailrecFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else tailrecFact(n - 1, n * acc)

  println(tailrecFact(10))
}
