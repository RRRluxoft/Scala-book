import ChecksumAccumulator._
import com.github.junitrunner.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
object Summer extends FunSuite with App {
//  override def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
//  }

  val result = gcb(25, 15)
  val result2 = gcb(15, 25)

  println(result)
  println(result2)

  test("greatest common divisor") {
    assert(result == result2)
    assertResult(5)(result)
  }
}
