package htwg.se.minesweeper

import se.minesweeper.model.Marker
import se.minesweeper.model.Matrix
import se.minesweeper.model.Field
import scala.io.StdIn._

@main def run: Unit =
  println("Welcome to Minesweeper")
  val field = new Field(6, Marker.Empty)
  println(field.toString)
  getInputAndPrintLoop(field)

def getInputAndPrintLoop(field: Field): Unit =
  val input = readLine
  parseInput(input) match
    case None => field
    case Some(newfield) =>
      println(newfield)
      getInputAndPrintLoop(newfield)

  def parseInput(input: String): Option[Field] =
    input match
      case "q" => None
      case _ => {
        val chars = input.toCharArray
        val marker = chars(0) match
          case 'F' => Marker.F
          case 'f' => Marker.F
          case 'O' => Marker.O
          case 'o' => Marker.O
          case _   => Marker.Empty
        val x = chars(1).toString.toInt
        val y = chars(2).toString.toInt
        Some(field.put(marker, x, y))
      }