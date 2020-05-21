
import config.Environment
import org.scalatest._
import routers.HttpRouterImpl

class Tests extends FlatSpec with Matchers {

  /**
   * Some tests in Scala using native BDD and infix concepts.
   *
   * @author Jefferson Marchetti Ferreira
   *
   */
  it should "return a Boolean of the Local Mode Key" in {
    Environment.isRunningLocalMode() should be(true || false)
  }

  /**
   * Some tests in Scala using native BDD and infix concepts.
   *
   * @author Jefferson Marchetti Ferreira
   *
   */
  it should "return true if the password is valid" in {
    val password = "Sds#dsdsdsd123"
    val x = assert(HttpRouterImpl.applyPasswordValidation(password))
    x
  }
}
