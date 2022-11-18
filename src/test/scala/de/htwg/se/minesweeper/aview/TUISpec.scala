package de.htwg.se.minesweeper
package aview

import controller.Controller
import model.Field
import model.Move
import model.Marker
import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class TuiSpec extends AnyWordSpec {

  "The TUI" should {
    val tui = TUI(Controller(new Field(3, Marker.Empty)))
    "recognize the input f12 as move of marker f to field (1,2)" in {
      tui.analyseInput("f12") should be(Some(Move(Marker.F, 1, 2)))
    }
  }
}