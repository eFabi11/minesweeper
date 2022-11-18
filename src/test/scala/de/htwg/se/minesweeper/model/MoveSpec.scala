package de.htwg.se.minesweeper.model

import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class MoveSpec extends AnyWordSpec {
  "A Move" should {
    "have a marker, and a position with x and y coord." in {
      val move = Move(Marker.F, 1, 2)
      move.marker should be(Marker.F)
      move.x should be(1)
      move.y should be(2)
    }
  }
}