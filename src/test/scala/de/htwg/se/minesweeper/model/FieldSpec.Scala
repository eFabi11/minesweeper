package se.de.htwg.minesweeper.model
import se.de.htwg.minesweeper.model.Field

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class FieldSpec extends AnyWordSpec{
    "FieldSpec" should {
        "have a bar as String of form '+---+---+---+'" in {
            bar() should be("+---+---+---+" + eol)
        }
        "have a scalable bar" in {
            bar(1, 1) should be("+---+" + eol)
            bar(2, 2) should be("+---+---+" + eol)
            bar(3, 3) should be("+---+---+---+" + eol)
        }
        "have cells as String of form '|   |   |   |'" in {
            cells() should be("|   |   |   |" + eol)

        }
        "have scalable cells" in {
            cells(1, 1) should be("|   |" + eol)
            cells(2, 2) should be("|   |   |" + eol)
            cells(3, 3) should be("|   |   |   |" + eol)
        }

    }
}