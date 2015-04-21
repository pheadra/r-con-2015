package quickstart.action

import xitrum.annotation.{GET, POST}

@GET("")
class SiteIndex extends DefaultLayout {
  def execute() {
    respondView(Map("type" ->"mustache"))
  }
}
@GET("Schedule")
class Schedule extends DefaultLayout {
  def execute() {
    respondView(Map("type" ->"mustache"))
  }
}
@GET("Speaker")
class Speaker extends DefaultLayout {
  def execute() {
    respondView(Map("type" ->"mustache"))
  }
}
@GET("Contact")
class Contact extends DefaultLayout {
  def execute() {
    respondView(Map("type" ->"mustache"))
  }
}
@GET("Info")
class Info extends DefaultLayout {
  def execute() {
    respondView(Map("type" ->"mustache"))
  }
}
@POST("/Info")
class Postinfo extends DefaultLayout {
  def execute() {
    respondJson("okay")
  }
}