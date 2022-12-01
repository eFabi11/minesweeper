package de.htwg.se.minesweeper.model.interpreter

import de.htwg.se.minesweeper.model.interpreter.{GameInterpreter, Interpreter}

class MenuInterpreter extends Interpreter {

  override val descriptor: String = "Please enter s00 for a new game"

  val newGame: String = "s00"
  val wrongInput: String = ".*"

  def doNewGame(input: String): (String, GameInterpreter) = ("",new GameInterpreter)

  def doWrongInput(input: String): (String, MenuInterpreter) = ("Wrong input. Please try again.", this)

  override val actions: Map[String, String => (String, Interpreter)] =
    Map((wrongInput, doWrongInput),(newGame,doNewGame))
}