package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favMovie: String) {
    def likes(movie: String): Boolean = movie == favMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, Hell!"

    def apply(): String = s"Hi, my name is $name and I like $favMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix notation = operator notation (syntactic sugar)

  // "operators" in scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 1)
  println(1.+(2))
  // ALL OPERATORS ARE METHODS

  // prefix notation
  val x = -1
  val y = 1.unary_-
  // unary_ operator only works with - + ~ !
  println(!mary)

  // postfix notation

  // apply
  println(mary.apply())
  println(mary())
}
