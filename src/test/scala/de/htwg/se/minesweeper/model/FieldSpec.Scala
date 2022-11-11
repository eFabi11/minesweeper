package se.minesweeper.model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class FieldSpec extends AnyWordSpec {
  "A Minesweeper Field" when {
    "filled with F" should {
      val field1 = new Field(1, Marker.F)
      val field2 = new Field(2, Marker.F)
      val field3 = new Field(3, Marker.F)
      val eol = sys.props("line.separator")
      "have a bar as String of form '+---+---+---+'" in {
        field3.bar() should be("+---+---+---+" + eol)
      }
      "have a scalable bar" in {
        field1.bar(1, 1) should be("+---+" + eol)
        field1.bar(2, 2) should be("+---+---+" + eol)
        field1.bar(3, 3) should be("+---+---+---+" + eol)
        }
      "have cells as String of form '| F | F | F |'" in {
        field3.cells(0) should be("| F | F | F |" + eol)
      }
      "have scalable cells" in {
        field1.cells(0, 1) should be("|F|" + eol)
        field2.cells(0, 1) should be("|F|F|" + eol)
        field1.cells(0, 3) should be("| F |" + eol)
      }
      "have a mesh in the form " +
        "+-+" +
        "|F|" +
        "+-+" in {
        }
    }
    "filled with O" should {
      val field2 = new Field(2, Marker.O)
      val field3 = new Field(3, Marker.O)
      val eol = sys.props("line.separator")
      "have a bar as String of form '+---+---+---+'" in {
        field3.bar() should be("+---+---+---+" + eol)
      }
      "have cells as String of form '| O | O | O |'" in {
        field3.cells(0) should be("| O | O | O |" + eol)
      }
      "have scalable cells" in {
        field2.cells(0, 1) should be("|O|O|" + eol)
      }
      "have a mesh in the form " +
        "+-+" +
        "|O|" +
        "+-+" in {
        }

    }
    "filled with Empty" should {
      var field = new Field(3, Marker.Empty)
      "be empty initially" in {
        field.toString should be(("""#+---+---+---+
          #|   |   |   |
          #+---+---+---+
          #|   |   |   |
          #+---+---+---+
          #|   |   |   |
          #+---+---+---+
          #""").stripMargin('#'))
      }
      "have an X and O after two moves" in {
        field.put(Marker.F, 0, 0).put(Marker.O, 1, 1).toString should be(("""#+---+---+---+
          #| F |   |   |
          #+---+---+---+
          #|   | O |   |
          #+---+---+---+
          #|   |   |   |
          #+---+---+---+
          #""").stripMargin('#'))
      }
    }
  }

}