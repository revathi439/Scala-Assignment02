package Assignment2

object ArrayQ2 extends App {

/*  To find maximum product of two numbers in a given array */
  def maxproduct(a: Array[Int]) = {

    var maxiproduct = Integer.MIN_VALUE;
    var max_i = -1
    var max_j = -1
    for ( i<- 0 to a.length - 1)
    {
      for (j<- i + 1 to  a.length - 1)
      {
        if (maxiproduct < a(i) * a(j))
        {
          maxiproduct = a(i) * a(j)
          max_i = i
          max_j = j
        }
      }
    }
    val output = (a(max_i)*a(max_j));
    output
  }
  val a = Array(2,3,5,7,-7,5,8,-5 )
 println("maximum product is: " + maxproduct(a))
}
