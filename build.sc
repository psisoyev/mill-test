import mill._, scalalib._, scalafmt._
import $ivy.`com.lihaoyi::mill-contrib-bsp:$MILL_VERSION`
import $ivy.`com.lihaoyi::mill-contrib-bloop:$MILL_VERSION`

object Deps {
  object V {
    val ContextApplied   = "0.1.4"
    val Cats             = "2.1.1"
    val CatsEffect       = "2.1.2"
  }

  val Cats              = ivy"org.typelevel::cats-core:${V.Cats}"
  val CatsEffect        = ivy"org.typelevel::cats-effect:${V.CatsEffect}"

  val ContextApplied   = ivy"org.augustjune::context-applied:${V.ContextApplied}"
}

// ----------------------------------------------------------------------------
object example extends ScalaModule with ScalafmtModule {
  def scalaVersion = "2.13.2"

  def ivyDeps =
    Agg(
      Deps.Cats,
      Deps.CatsEffect
    )

  def compileIvyDeps = Agg(Deps.ContextApplied)
  def scalacPluginIvyDeps = Agg(Deps.ContextApplied)
}
