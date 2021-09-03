import Assignment2.ListQ2
import org.scalatest.funsuite.AnyFunSuite

class ListQ2Test extends AnyFunSuite{

  test("ListQ2Test"){
    assert(ListQ2.find(List(2,5,3,4,6,7,8,9))===List(5,4,7,9))
  }

}
