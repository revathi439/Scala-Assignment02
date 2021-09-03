package Assignment2

/* replace the number with the maximum number which is in present it's right side in a given array */

object ArrayQ1 extends App{
  def max(x: Array[Int]): Array[Int] = {
    val size = x.length
    var max = x(size - 1)
    x(size - 1) = -1
    var temp = 0
    for (i <- size - 2 to 0 by -1) {
      temp = x(i)
      x(i) = max
      if (max < temp)
        max = temp
    }
    x
  }

  val a = Array(9,5,8,4,-10,21,16,17,11)
  println("Original array:")
  for (x <- a) {
    print(s"${x}, ")
  }

  val result = max(a)
  println("\nThe modified array:")
  for (x <- result) {
  print(s"${x}, ")
  }

}
