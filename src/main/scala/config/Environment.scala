package config

object Environment {
  val conf = com.typesafe.config.ConfigFactory.load()

  def isRunningLocalMode(): Boolean = {
    conf.getBoolean("Configuration.LocalMode")
  }
}
