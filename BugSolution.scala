```scala
object Main extends App {
  val obj = new MyClass()
  println(obj.x) // Prints 0

  val obj2 = new MyClass(5)
  println(obj2.x) // Prints 5

  //Corrected approach: directly assign a default value during object creation.
  val obj3 = new MyClass(10)
  println(obj3.x) // Prints 10
  //Alternative approach to enable overriding but sacrifices immutability:
  //class MyClass(var x: Int) { def this() = this(0)}
}

class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}
```