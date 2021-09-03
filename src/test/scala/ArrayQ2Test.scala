import Assignment2.ArrayQ2
import org.scalatest.funsuite.AnyFunSuite

class ArrayQ2Test extends AnyFunSuite{
test("ArrayQ2"){
  assert(ArrayQ2.maxproduct(Array(2,3,5,7,-7,5,8,-5 ))===56)
}
}

