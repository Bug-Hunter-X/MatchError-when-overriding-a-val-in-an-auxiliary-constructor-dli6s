```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

object Main extends App {
  val obj = new MyClass()
  println(obj.x) // Prints 0

  val obj2 = new MyClass(5)
  println(obj2.x) //Prints 5

  val obj3 = new MyClass{ override val x = 10 }
  println(obj3.x) // Throws a MatchError
}
```