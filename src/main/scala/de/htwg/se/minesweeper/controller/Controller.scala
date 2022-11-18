package de.htwg.se.minesweeper.controller

import de.htwg.se.minesweeper.model.{Field, Marker}
import de.htwg.se.minesweeper.util.Observable


case class Controller(var field: Field) extends Observable:
  def put(marker: Marker, x: Int, y: Int): Unit =
    field = field.put(marker, x, y)
    notifyObservers
  override def toString: String = field.toString