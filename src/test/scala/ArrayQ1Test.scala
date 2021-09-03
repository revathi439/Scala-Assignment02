import Assignment2.ArrayQ1
import org.scalatest.funsuite.AnyFunSuite

class ArrayQ1Test extends AnyFunSuite{

  test("ArrayQ1"){
    assert(ArrayQ1.max(Array(9,5,8,4,-10,21,16,17,11))===Array(21,21,21,21,21,17,17,11,-1))
  }

}

