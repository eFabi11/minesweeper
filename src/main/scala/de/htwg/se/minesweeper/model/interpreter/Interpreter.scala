package de.htwg.se.minesweeper.model.interpreter

trait Interpreter {

    val actions: Map[String, String => (String, Boolean)]

    val descriptor: String

    final def selectRegex(input: String): String => (String, Boolean) =
        actions.filter(k => input.matches(k._1)).last._2

    final def processInputLine(input: String): (String, Boolean) = selectRegex(input)(input)
}