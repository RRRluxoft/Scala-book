import akka.actor.{Actor, ActorRef, ActorSystem, Props}

class HelloActor(myName: String, secName: String = "Doe") extends Actor {

  override def receive: Receive = {
    case "hello" => println(s"hello back to you from $myName $secName")
    case _ => println(s"'huh?', said $myName")
  }
}

  object Main extends App {

    val system = ActorSystem("System")

    val helloActor: ActorRef =system.actorOf(Props(new HelloActor("Fred")), name = "helloactor")

//    send the actor 2 msg:
    helloActor !("hello")
    helloActor ! "gutten dak"

    system.terminate() // shutdown is deprecated
  }

