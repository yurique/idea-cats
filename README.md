### IDEA-Cats

IntelliJ IDEA is a great IDE for Scala development. 
But sometimes the libs we use are too complicated for the current version of the Scala plugin to handle.

The Scala plugin is being actively developed and hopefully one day this "lib" will no longer be needed.

IDEA-Cats allows you to do this:
```scala
import cats.idea._
```

And then IDEA will be able to understand things like this:

```scala
import cats.syntax.all._
import cats.data._
import cats.idea._

package object idea {

  val v1: ValidatedNel[String, Int] = 1.validNel
  val v2: ValidatedNel[String, Int] = 2.validNel
  val r = (v1, v2).mapN { case (x1, x2) =>  x1 + x2 }
}
```

That additional import - `import cats.idea._` helps IDEA figure out the types.

The downside is that the compiled code will actually have an additional "step" in the call-stack.

Please note that IDEA-Cats is a quick and dirty solution :) (which nevertheless works)  

#### Setup

#### sbt
```
resolvers += "jitpack" at "https://jitpack.io"
libraryDependencies += "com.github.yurique" % "idea-cats" % "0.0.1"	
```

#### mill

```
object myModule extends ScalaModule {

    override def repositories = super.repositories ++ Seq(
      MavenRepository("https://jitpack.io")
    )
    
    override def ivyDeps = super.ivyDeps() ++ Seq(
        ivy"com.github.yurique::idea-cats:0.0.1"
    )
    
}
```

### What's included

##### `mapN` and `traverseN` from `SemigroupalSyntax` for tuples of `ValidatedNel` 
 
```scala
val v1: ValidatedNel[String, Int] = ???
val v2: ValidatedNel[String, Int] = ???
val r = (v1, v2).mapN { case (x1, x2) =>  x1 + x2 }
```

There is a couple of IDEA issues about this:
* https://youtrack.jetbrains.com/issue/SCL-12892
* https://youtrack.jetbrains.com/issue/SCL-14522
