package lectures.part2oop

object OOBasics extends App {
 val person = new Person("Edward", 29)
 println(person.age)
 person.greet("Me")
 person.greet()
}

// constructor
// class parameters are not fields
class Person(name: String, val age: Int) {
  // body

  val x = 69
  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading - same method name with different parameters
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
}