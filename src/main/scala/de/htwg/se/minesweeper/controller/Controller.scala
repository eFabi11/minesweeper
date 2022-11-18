package de.htwg.se.minesweeper
package controller

import model.Field
import model.Move
import model.Marker
import de.htwg.se.minesweeper.util.Observable


case class Controller(var field: Field) extends Observable:
  def doAndPublish(doThis: Move => Field, move:Move): Unit =
    field = doThis(move)
    notifyObservers
  def put(move: Move): Field =
    field.put(move.marker, move.x, move.y)
  override def toString: String = field.toString