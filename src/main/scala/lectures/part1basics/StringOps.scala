package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(6, 9))
  println(str.split(" ").toList)
  println(str.contains("Hello"))

  println(s"$str")
  // interpolators
  // S
  // F
  // raw
}
