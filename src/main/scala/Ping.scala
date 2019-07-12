import akka.actor.{Actor, ActorRef}

case object StartMessage
case object StopMessage
case object PingMessage


class Ping(pong: ActorRef) extends Actor {
  var count = 0
  def incrementAndPing() { count = count + 1; println("ping")}

  override def receive: Receive = {
    case StartMessage =>
      incrementAndPing()
      pong ! PingMessage

    case PongMessage =>
      incrementAndPing()
      if (count > 9) {
        sender ! StopMessage
        println("ping stopped")
        context.stop(self)
      } else {
        sender() ! PingMessage
      }

    case _ => println("Ping got smth unexpected!")
  }

}
