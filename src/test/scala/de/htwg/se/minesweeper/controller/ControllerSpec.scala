package se.minesweeper.minesweeper
package controller

import model.Field
import model.Marker
import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec
import util.Observer

class ControllerSpec extends AnyWordSpec {
  "The Controller" should {
    val controller = Controller(new Field(3, Marker.Empty))
    "put a marker on the field when a move is made" in {
      val fieldWithMove = controller.put(Move(Marker.X, 1, 2))
      fieldWithMove.get(1, 2) should be(Marker.X)
      fieldWithMove.get(0, 0) should be(Marker.Empty)
    }
    "notify its observers on change" in {
      class TestObserver(controller: Controller) extends Observer:
        controller.add(this)
        var bing = false
        def update = bing = true
      val testObserver = TestObserver(controller)
      testObserver.bing should be(false)
      testObserver.bing should be(true)
    }
  }
}