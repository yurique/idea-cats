import cats.syntax.all._
import cats.data._
import cats.idea._

package object idea {

  val v1: ValidatedNel[String, Int] = 1.validNel
  val v2: ValidatedNel[String, Int] = 2.validNel
  val r = (v1, v2).mapN { case (x1, x2) =>  x1 + x2 }
}