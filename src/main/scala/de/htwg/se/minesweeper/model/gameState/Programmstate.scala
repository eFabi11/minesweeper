package de.htwg.se.minesweeper.model.gameState

import de.htwg.se.minesweeper.model.Field
import de.htwg.se.minesweeper.model.interpreter.Interpreter

trait ProgrammState {
 
 val interpreter : Interpreter
 def handle(input:String): (ProgrammState, String) 
}