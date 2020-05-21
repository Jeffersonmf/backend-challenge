package routers

import akka.util.ByteString
import colossus.core.ServerContext
import colossus.protocols.http.{Http, HttpBody, HttpCodes, HttpHeader, HttpHeaders, HttpResponse, HttpVersion}
import colossus.protocols.http.HttpMethod._
import colossus.protocols.http.UrlParsing._
import colossus.protocols.http.server.RequestHandler
import colossus.service.Callback
import colossus.service.GenRequestHandler.PartialHandler

class HttpRouterHandler(context: ServerContext) extends RequestHandler(context) {

  override def handle: PartialHandler[Http] = {
    case request @ Get on Root => {
      Callback.successful(request.ok("Welcome to Scala Colossus!!!!"))
    }
    case request @ Get on Root / "monitoring" => {
      Callback.successful(request.ok("Backend Challenge is up!!!"))
    }
    case request @ Get on Root / "validate" / password => {
      Callback.successful(request.ok(ByteString(HttpRouterImpl.validatePassword(password))))
    }
  }
}
