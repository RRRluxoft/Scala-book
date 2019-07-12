import akka.actor.Actor

case object PongMessage

class Pong extends Actor {

  override def receive: Receive = {
    case PingMessage =>
      println(" pong")
      sender() ! PongMessage

    case StopMessage =>
      println("pong stopped")
      context.stop(self)

    case _ => println("Pong got smth unexpected!")
  }

}