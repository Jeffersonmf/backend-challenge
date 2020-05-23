
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
   * Some tests in Scala using native BDD concepts.
   *
   * @author Jefferson Marchetti Ferreira
   *
   */
  it should "return false if the password \"\" is invalid" in {
    val password = ""
    val res = HttpRouterImpl.validatePassword(password)
    assert(!res)
  }

  /**
   * Some tests in Scala using native BDD concepts.
   *
   * @author Jefferson Marchetti Ferreira
   *
   */
  it should "return false if the password 'aa' is invalid" in {
    val password = "aa"
    val res = HttpRouterImpl.validatePassword(password)
    assert(!res)
  }


  /**
   * Some tests in Scala using native BDD concepts.
   *
   * @author Jefferson Marchetti Ferreira
   *
   */
  it should "return false if the password 'ab' is invalid" in {
    val password = "ab"
    val res = HttpRouterImpl.validatePassword(password)
    assert(!res)
  }

  /**
   * Some tests in Scala using native BDD concepts.
   *
   * @author Jefferson Marchetti Ferreira
   *
   */
  it should "return false if the password 'AAAbbbCc' is invalid" in {
    val password = "AAAbbbCc"
    val res = HttpRouterImpl.validatePassword(password)
    assert(!res)
  }

  /**
   * Some tests in Scala using native BDD concepts.
   *
   * @author Jefferson Marchetti Ferreira
   *
   */
  it should "return false if the password 'AbTp9!foo' is invalid" in {
    val password = "AbTp9!foo"
    val res = HttpRouterImpl.validatePassword(password)
    assert(!res)
  }

  /**
   * Some tests in Scala using native BDD concepts.
   *
   * @author Jefferson Marchetti Ferreira
   *
   */
  it should "return true if the password 'AbTp9!fok' is valid" in {
    val password = "AbTp9!fok"
    val res = HttpRouterImpl.validatePassword(password)
    assert(res)
  }

}
