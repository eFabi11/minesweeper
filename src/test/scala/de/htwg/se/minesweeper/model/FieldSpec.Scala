package de.htwg.se.minesweeper.model
import model.Field

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class FieldSpec extends AnyWordSpec{
    "FieldSpec" should {
        "have a bar as String of form '+---+---+---+'" in {
            Field.bar() should be("+---+---+---+" + Field.eol)
        }
        "have a scalable bar" in {
            Field.bar(1, 1) should be("+---+" + Field.eol)
            Field.bar(2, 2) should be("+---+---+" + Field.eol)
            Field.bar(3, 3) should be("+---+---+---+" + Field.eol)
        }
        "have cells as String of form '|   |   |   |'" in {
            Field.cells() should be("|   |   |   |" + Field.eol)

        }
        "have scalable cells" in {
            Field.cells(1, 1) should be("|   |" + Field.eol)
            Field.cells(2, 2) should be("|   |   |" + Field.eol)
            Field.cells(3, 3) should be("|   |   |   |" + Field.eol)
        }

    }
}