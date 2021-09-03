package Assignment2

/*
return a new list removing the elements at odd positions.
 */
object ListQ2 extends App{
  def find[b](arr:List[b]):List[b] = (arr.indices.collect { case i if i % 2 == 1 => arr(i) }).toList
  val a = List(2,5,3,4,6,7,8,9)
  println(a)
  val out = find(a)
  out.foreach(println(_))


}
