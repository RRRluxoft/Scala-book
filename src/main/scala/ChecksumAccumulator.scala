import scala.annotation.tailrec
import scala.collection.mutable.Map

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) = sum += b
  def checksum() = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {
  private val cache = Map.empty[String, Int]

  def calculate(s: String): Int = {
    if (cache.contains(s)) cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s) {
        acc.add(c.toByte)
      }
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }

  @tailrec
  def gcb(a: Int, b: Int): Int = {
    if (b == 0) return a
    val bigger = if (a < b) b else a
    val smaller = if (a < b) a else b
    gcb(smaller, bigger % smaller)
  }

}
