package de.htwg.se.minesweeper

import model.Marker

import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class MakerSpec extends AnyWordSpec{
    "Marker.F " should{
        "have a value F" in {
            (Marker.F).toString should be ("F")
        }
    }
        "Marker.O " should{
        "have a value O" in {
            (Marker.O).toString should be ("O")
        }
    }
        "Marker.M " should{
        "have a value *" in {
            (Marker.M).toString should be ("*")
        }
    }
        "Marker.Empty " should{
        "have a value  " in {
            (Marker.Empty).toString should be (" ")
        }
    }
    
}