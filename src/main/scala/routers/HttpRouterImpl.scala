package routers

import config.Environment

object HttpRouterImpl {

  private def buildLogPattern() = {
    """^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#!$%^&+=])(?=\S+$).{8,}$""".r
  }

  def validatePassword(password: String): Boolean = {
    applyPasswordValidation(password)
  }

  private def verifyDuplicateChar(password: String): Boolean = {
    var validate = true

    password.foreach(p=> {
      if(password.count(_ == p) > 1)
        validate = false
    })

    validate
  }

  private def applyPasswordValidation(password: String): Boolean = {
    val PATTERN = buildLogPattern()

    val first = PATTERN.findFirstMatchIn(password) match {
      case Some(_) => true
      case None => false
    }

    val second = verifyDuplicateChar(password)

    (first & second)
  }
}
