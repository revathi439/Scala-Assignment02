package Assignment2

/*
count the elements in the given array
 */
object ListQ3 extends App {
  def length[A](l: List[A]): Int = l.foldLeft(0) { (c, _) => c + 1 }

val a= List(1,2,3,4,5)
val out = length(a)
  println("length of the string is: " + out)
}
