import mill._
import scalalib._
import scalajslib._
import publish._
import ammonite.ops._

val catsVersion = "1.4.0"

trait CommonModule extends ScalaModule {

  override def sources = T.sources(millSourcePath / "src")
  override def ivyDeps = super.ivyDeps() ++ Seq(
    ivy"org.typelevel::cats-core::${catsVersion}"
  )

}

trait CommonPublishModule extends CommonModule with PublishModule with CrossScalaModule {
  def publishVersion = "0.0.5"
  def pomSettings = PomSettings(
    description = "Some desperate hacks to make idea understand some cats",
    organization = "com.github.yurique",
    url = "https://github.com/yurique/idea-cats",
    licenses = Seq(License.`Apache-2.0`),
    versionControl = VersionControl.github("yurique", "idea-cats"),
    developers = Seq(
      Developer("yurique", "Iurii Malchenko", "https://github.com/yurique")
    )
  )
  def m2 = T {
    val pa = publishArtifacts()
    val wd = T.ctx().dest
    val ad = pa.meta.group
      .split("\\.")
      .foldLeft(wd)((a, b) => a / b) / pa.meta.id / pa.meta.version
    mkdir(ad)
    pa.payload.map { case (f, n) => cp(f.path, ad / n) }
  }
}

trait IdeaCatsModule extends CommonPublishModule {
  override def artifactName = "idea-cats"
  def millSourcePath = build.millSourcePath / "main"
  override def scalacOptions = super.scalacOptions() ++ Seq(
    "-Ypartial-unification",
    "-language:higherKinds",
    "-unchecked",
    "-deprecation",
    "-encoding", "utf8",
    "-feature"
  )
}

object main extends Module {

  object jvm extends Cross[IdeaCatsJvmModule]("2.12.7")
  class IdeaCatsJvmModule(val crossScalaVersion: String) extends IdeaCatsModule {
  }

  object js extends Cross[IdeaCatsJsModule]("2.12.7")
  class IdeaCatsJsModule(val crossScalaVersion: String) extends IdeaCatsModule with ScalaJSModule {
    override def scalaJSVersion = "0.6.25"
  }

}
