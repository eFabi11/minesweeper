package de.htwg.se.minesweeper.model.interpreter

class GameInterpreter extends Interpreter {

  override val descriptor: String = "Please enter the Field you want to flag or open"

  val move:String = "[f|F|o|O][0-8][0-8]"
  val wrongMove: String = ".*"

  def doMove(input: String): (String, GameInterpreter) =
    (s"${input(1)}${input(2)} set to ${input(0)}", this)

  def doWrongMove(input:String): (String, GameInterpreter) =
    ("Wrong move. Please try again.",this)

  override val actions: Map[String, String => (String, Interpreter)] =
    Map((wrongMove, doWrongMove), (move,doMove))
}