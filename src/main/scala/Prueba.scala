import scala.concurrent.{Await, Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.Success

object Prueba extends App{
  val a = Option(1)


  def hhh (intVal : Int, intVal2: Int) = intVal + intVal2

  def jjj = hhh(_, 1)

  jjj(1)
  val n = a match {


    case z : AnyRef if z.map(_ == 2).getOrElse(false) => "Anyref"
    case x @ Some(_) => "Modificado" + x
    case None => "Otra cosa"
  }
  println(n)

  val d: Option[String] = a.flatMap(x => Some("Modificado" + x))
  val e: Option[Option[String]] = a.map(z => Some("Modificado" + z))

  val j = List("a","b")
  val k = j.flatMap(x => List("1", x))
  val l = j.map(x => List("1",x)).flatten
  val b = Some("")
  println(j)
  println(k)
  val y = for {
    algo <- a
    otracosa <- b
  } yield "alguna cosa"

  println(y)


  val wertyu = Future.successful{

    "aaa"
  }

  val p : Promise[String] = Promise()

  val p22 = Promise.fromTry{
    Success("aaa")
  }

  val otro = Future {
    Thread.sleep(1234)
    p.trySuccess("Hola mundo")
  }
  val t = for {
    a <- wertyu
    b <- p22.future
  } yield s"A es $a y b es $b"

  val res = Await.result(t, 2.seconds)

  println(res)
}
