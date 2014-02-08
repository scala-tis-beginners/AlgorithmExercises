package exercise

import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.Matchers._

import exercise.Exercise._

/**
 * Created by kazuki on 2014/02/08.
 */
class Exercise$Test extends FunSuite {

  test("s2 が s1 の一部になっている場合は true") {
    val truePairs = Table (
      ("s1"   , "s2"),
      ("test" , "test"),
      ("test" , "es"),
      ("test" , "t"),
      ("test" , ""),
      ("あいあいう", "あいう")
    )
    forAll(truePairs) { (s1, s2) =>
      isSubstring(s1, s2) should be (true)
    }
  }

  test("s2 が s1 の一部になっていない場合は false") {
    val falsePairs = Table (
      ("s1"   , "s2"),
      ("test" , "aaa"),
      ("test" , "ea"),
      (""     , "t"),
      ("あいあいかう", "あいう")
    )
    forAll(falsePairs) { (s1, s2) =>
      isSubstring(s1, s2) should be (false)
    }
  }

}
