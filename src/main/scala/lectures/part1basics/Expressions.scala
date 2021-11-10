package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // expression
  println(x)

  val someValue = {
    2 < 3
  }

  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
}
