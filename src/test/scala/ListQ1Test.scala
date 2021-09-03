import Assignment2.ListQ1
import org.scalatest.funsuite.AnyFunSuite

class ListQ1Test extends AnyFunSuite{

  test("ListQ1Test"){
    assert(ListQ1.find(List(1,2,3,4),3)===List(1,1,1,2,2,2,3,3,3,4,4,4))
  }

}
