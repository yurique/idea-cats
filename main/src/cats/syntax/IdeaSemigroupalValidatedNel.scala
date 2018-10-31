package cats
package syntax
import data.ValidatedNel
import instances.all._
import syntax.all._

import scala.language.implicitConversions

trait IdeaSemigroupalValidatedNelSyntax {
  implicit def catsSyntaxTuple1SemigroupalValidatedNel[A0, B0](tt: Tuple1[ValidatedNel[A0, B0]]): Tuple1ValidatedNelSemigroupalOps[A0, B0] = new Tuple1ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple2SemigroupalValidatedNel[A0, B0, B1](tt: Tuple2[ValidatedNel[A0, B0], ValidatedNel[A0, B1]]): Tuple2ValidatedNelSemigroupalOps[A0, B0, B1] = new Tuple2ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple3SemigroupalValidatedNel[A0, B0, B1, B2](tt: Tuple3[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2]]): Tuple3ValidatedNelSemigroupalOps[A0, B0, B1, B2] = new Tuple3ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple4SemigroupalValidatedNel[A0, B0, B1, B2, B3](tt: Tuple4[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3]]): Tuple4ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3] = new Tuple4ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple5SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4](tt: Tuple5[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4]]): Tuple5ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4] = new Tuple5ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple6SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5](tt: Tuple6[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5]]): Tuple6ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5] = new Tuple6ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple7SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6](tt: Tuple7[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6]]): Tuple7ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6] = new Tuple7ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple8SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7](tt: Tuple8[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7]]): Tuple8ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7] = new Tuple8ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple9SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8](tt: Tuple9[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8]]): Tuple9ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8] = new Tuple9ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple10SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9](tt: Tuple10[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9]]): Tuple10ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9] = new Tuple10ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple11SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10](tt: Tuple11[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10]]): Tuple11ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10] = new Tuple11ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple12SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11](tt: Tuple12[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11]]): Tuple12ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11] = new Tuple12ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple13SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12](tt: Tuple13[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12]]): Tuple13ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12] = new Tuple13ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple14SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13](tt: Tuple14[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13]]): Tuple14ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13] = new Tuple14ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple15SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14](tt: Tuple15[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14]]): Tuple15ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14] = new Tuple15ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple16SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15](tt: Tuple16[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15]]): Tuple16ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15] = new Tuple16ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple17SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16](tt: Tuple17[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15], ValidatedNel[A0, B16]]): Tuple17ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16] = new Tuple17ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple18SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17](tt: Tuple18[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15], ValidatedNel[A0, B16], ValidatedNel[A0, B17]]): Tuple18ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17] = new Tuple18ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple19SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18](tt: Tuple19[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15], ValidatedNel[A0, B16], ValidatedNel[A0, B17], ValidatedNel[A0, B18]]): Tuple19ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18] = new Tuple19ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple20SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19](tt: Tuple20[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15], ValidatedNel[A0, B16], ValidatedNel[A0, B17], ValidatedNel[A0, B18], ValidatedNel[A0, B19]]): Tuple20ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19] = new Tuple20ValidatedNelSemigroupalOps(tt)
  implicit def catsSyntaxTuple21SemigroupalValidatedNel[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20](tt: Tuple21[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15], ValidatedNel[A0, B16], ValidatedNel[A0, B17], ValidatedNel[A0, B18], ValidatedNel[A0, B19], ValidatedNel[A0, B20]]): Tuple21ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20] = new Tuple21ValidatedNelSemigroupalOps(tt)
}

private[syntax] final class Tuple1ValidatedNelSemigroupalOps[A0, B0](tt: Tuple1[ValidatedNel[A0, B0]]) {
  def map[Z](f: B0 => Z): ValidatedNel[A0, Z] = tt.map(f)



  def traverse[G[_]: Applicative, Z](f: (B0) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverse(f)

}
private[syntax] final class Tuple2ValidatedNelSemigroupalOps[A0, B0, B1](tt: Tuple2[ValidatedNel[A0, B0], ValidatedNel[A0, B1]]) {
  def mapN[Z](f: (B0, B1) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple3ValidatedNelSemigroupalOps[A0, B0, B1, B2](tt: Tuple3[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2]]) {
  def mapN[Z](f: (B0, B1, B2) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple4ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3](tt: Tuple4[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3]]) {
  def mapN[Z](f: (B0, B1, B2, B3) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple5ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4](tt: Tuple5[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple6ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5](tt: Tuple6[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple7ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6](tt: Tuple7[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple8ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7](tt: Tuple8[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple9ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8](tt: Tuple9[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple10ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9](tt: Tuple10[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple11ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10](tt: Tuple11[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple12ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11](tt: Tuple12[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple13ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12](tt: Tuple13[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple14ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13](tt: Tuple14[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple15ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14](tt: Tuple15[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple16ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15](tt: Tuple16[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple17ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16](tt: Tuple17[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15], ValidatedNel[A0, B16]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple18ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17](tt: Tuple18[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15], ValidatedNel[A0, B16], ValidatedNel[A0, B17]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple19ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18](tt: Tuple19[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15], ValidatedNel[A0, B16], ValidatedNel[A0, B17], ValidatedNel[A0, B18]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple20ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19](tt: Tuple20[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15], ValidatedNel[A0, B16], ValidatedNel[A0, B17], ValidatedNel[A0, B18], ValidatedNel[A0, B19]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
private[syntax] final class Tuple21ValidatedNelSemigroupalOps[A0, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20](tt: Tuple21[ValidatedNel[A0, B0], ValidatedNel[A0, B1], ValidatedNel[A0, B2], ValidatedNel[A0, B3], ValidatedNel[A0, B4], ValidatedNel[A0, B5], ValidatedNel[A0, B6], ValidatedNel[A0, B7], ValidatedNel[A0, B8], ValidatedNel[A0, B9], ValidatedNel[A0, B10], ValidatedNel[A0, B11], ValidatedNel[A0, B12], ValidatedNel[A0, B13], ValidatedNel[A0, B14], ValidatedNel[A0, B15], ValidatedNel[A0, B16], ValidatedNel[A0, B17], ValidatedNel[A0, B18], ValidatedNel[A0, B19], ValidatedNel[A0, B20]]) {
  def mapN[Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20) => Z): ValidatedNel[A0, Z] = tt.mapN(f)



  def traverseN[G[_]: Applicative, Z](f: (B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20) => G[Z]): G[ValidatedNel[A0, Z]] = tt.traverseN(f)

}
