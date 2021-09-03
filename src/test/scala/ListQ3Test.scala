import Assignment2.ListQ3
import org.scalatest.funsuite.AnyFunSuite

class ListQ3Test extends AnyFunSuite {
  test("ListQ3") {
    assert(ListQ3.length(List(2,5,1,4,3,7,8,6,0,9))===10)

  }
}
