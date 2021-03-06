package controllers

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a checkout message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def home = Action {
    Ok(views.html.home())
  }

  def checkout = Action {
    Ok(views.html.checkout())
  }

  def trackorder = Action {
    Ok(views.html.trackorder())
  }

  def accountinfo = Action {
    Ok(views.html.accountpage())
  }

  def kitchen = Action {
    Ok(views.html.kitchen())
  }
}
