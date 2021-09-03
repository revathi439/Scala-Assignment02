package Assignment2

/*
Update the values of a list with their absolute values.
 */
object ListQ4 extends App{
  def absolute(arr:List[Int]): List[Int] = {
    val list = scala.collection.mutable.ListBuffer[Int]()
    arr.foreach{
      x =>x match {
          case _ if (x <0) => list+= (x *(-1) )
          case _ => list += x
        }
    }
    list.toList
  }
  val b = List(-1,2,3,-4)
  val out = absolute(b)
  println("the absolute values are: " +out)

}
