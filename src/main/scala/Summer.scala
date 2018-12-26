import ChecksumAccumulator.calculate

object Summer extends App {
//  override def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
//  }

}
