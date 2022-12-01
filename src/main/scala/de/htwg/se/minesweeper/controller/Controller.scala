package de.htwg.se.minesweeper
package controller

import model.Field
import model.interpreter.Interpreter
import model.Move
import model.Marker
import de.htwg.se.minesweeper.util.Observable


case class Controller(var field: Field) extends Observable:

  var interpreter: Interpreter = new MenuInterpreter
  var output: String = "test"

  def computeInput(input: String): Unit =
    val result = interpreter.processInputLine(input)
    interpreter = result._2
    output = result._1
    notifyObservers

  def printDescriptor(): Unit =
    output = interpreter.descriptor
    notifyObservers







/*
  def doAndPublish(doThis: Move => Field, move:Move): Unit =
    field = doThis(move)
    notifyObservers
  def put(move: Move): Field =
    field.put(move.marker, move.x, move.y)
  override def toString: String = field.toString*/