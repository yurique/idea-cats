import mill._
import scalalib._
import publish._
import ammonite.ops._

object main extends ScalaModule with PublishModule {

  def scalaVersion = "2.12.7"
  def publishVersion = "0.0.1"
  val catsVersion = "1.4.0"

  override def artifactName = "idea-cats"

  def m2 = T {
    val pa = publishArtifacts()
    val wd = T.ctx().dest
    val ad = pa.meta.group
      .split("\\.")
      .foldLeft(wd)((a, b) => a / b) / pa.meta.id / pa.meta.version
    mkdir(ad)
    pa.payload.map { case (f, n) => cp(f.path, ad / n) }
  }

  def pomSettings = PomSettings(
    description = "Some desperate hacks to make idea understand some cats",
    organization = "io.github.yurique",
    url = "https://github.com/yurique/idea-cats",
    licenses = Seq(License.`Apache-2.0`),
    versionControl = VersionControl.github("yurique", "idea-cats"),
    developers = Seq(
      Developer("yurique", "Iurii Malchenko", "https://github.com/yurique")
    )
  )

  override def scalacOptions = super.scalacOptions() ++ Seq(
    "-target:jvm-1.8",
    "-Ypartial-unification",
    "-language:higherKinds",
    "-encoding",
    "utf8"
  )

  override def ivyDeps = super.ivyDeps() ++ Seq(
    ivy"org.typelevel::cats-core:${catsVersion}"
  )

}
