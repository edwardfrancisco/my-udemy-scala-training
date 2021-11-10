package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)
  // Vals are immutable
  // compiler can infer val types

  val aString: String = "This is string"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 1234
  val aLong: Long = 1419131413
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // varibales
  var aVariable: Int = 1
  aVariable = 2 // side effects
}
