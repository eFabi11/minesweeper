package htwg.se.minesweeper

import se.minesweeper.aview.TUI
import se.minesweeper.controller.Controller
import se.minesweeper.model.Marker
import se.minesweeper.model.Matrix
import se.minesweeper.model.Field
import scala.io.StdIn._

@main def run: Unit =
  println("Welcome to Minesweeper")
  val field = new Field(6, Marker.Empty)
  val controller = Controller(field)
  val tui = TUI(controller)
  tui.run
  
  
  //println(field.toString)
  //getInputAndPrintLoop(field)

//def getInputAndPrintLoop(field: Field): Unit =
  //val input = readLine
  //parseInput(input) match
    //case None => field
    //case Some(newfield) =>
      //println(newfield)
      //getInputAndPrintLoop(newfield)