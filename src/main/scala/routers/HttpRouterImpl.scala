package routers

import config.Environment

object HttpRouterImpl {

  private def buildLogPattern() = {
    """^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$""".r
  }

  def validatePassword(password: String): String = {
    applyPasswordValidation(password) match {
      case true => "OK"
      case false => "NOK"
    }
  }

  def applyPasswordValidation(password: String): Boolean = {
    val PATTERN = buildLogPattern()

    PATTERN.findFirstMatchIn(password) match {
      case Some(_) => true
      case None => false
    }
  }
}
