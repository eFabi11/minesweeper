package se.minesweeper.minesweeper
package aview

import controller.Controller
import model.Field
import model.Marker
import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class TuiSpec extends AnyWordSpec {

  "The TUI" should {
    val tui = TUI(Controller(new Field(3, Marker.Empty)))
    "recognize the input x12 as move of marker x to field (1,2)" in {
      tui.analyseInput("x12") should be(Some(Move(Marker.X, 1, 2)))
    }
  }
}