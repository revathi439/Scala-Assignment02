package Assignment2

/*
Maximum difference between the two numbers in a given array
 */

object ArrayQ3 extends App{

  def difference(a: Array[Int]): Int = {
    var difference = Integer.MIN_VALUE
    for (i <- 0 to a.length - 1) {
      for (j <- i + 1 to a.length - 1) {
        difference = Integer.max(difference, a(j) - a(i))
      }
    }
    return difference
  }

  val a = Array(2, 3, 1, 7, 9, 5, 11, 3, 5)
  println("Original array:")
  for (x <- a) {
    print(s"${x}, ")
  }
  System.out.print(s"\nThe maximum difference between two numbers in given array is: ${difference(a)}")
}
