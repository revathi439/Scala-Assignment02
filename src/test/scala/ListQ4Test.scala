import Assignment2.ListQ4
import org.scalatest.funsuite.AnyFunSuite

class ListQ4Test extends AnyFunSuite{

  test("ListQ4Test"){
    assert(ListQ4.absolute(List(-1,2,3,-4))===List(1,2,3,4))
  }

}
