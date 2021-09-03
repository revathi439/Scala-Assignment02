package Assignment2

/*
repeat each element in the list amount of times
 */
object ListQ1 extends App{

  def find[a](arr:List[a],b:Int):List[a] = {
  arr flatMap{ element => List.fill(b)(element) }
}
  val x = List(1,2,3,4)
  println("List is : " + x)
  val out = find(x,3)
  out.foreach(println(_))

}
