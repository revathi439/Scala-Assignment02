import Assignment2.ArrayQ3
import org.scalatest.funsuite.AnyFunSuite

class ArrayQ3Test extends AnyFunSuite{

  test("ArrayQ3"){
    assert(ArrayQ3.difference(Array(2, 3, 1, 7, 9, 5, 11, 3, 5))===10)
  }


}


